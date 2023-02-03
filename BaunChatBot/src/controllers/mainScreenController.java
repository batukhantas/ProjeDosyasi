package controllers;

import com.jfoenix.controls.JFXTextField;
import data.TextData;
import desing.ChatCustomListCell;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;
import org.w3c.dom.Text;
import reqs.ReqFuncs;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formattable;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ana ekrandaki olayları kapsayan ve bu olayların kontrol edildiği sınıf.
 */
public class mainScreenController implements Initializable {

    @FXML
    private ListView<TextData> chat_listView;

    @FXML
    private JFXTextField chat_textField;

    @FXML
    private AnchorPane mainPane;

    /**
     * gonder butonuna basildiginda mesaj gonderir
     */
    @FXML
    void gonder() {

        // Platform.runLater metodu JavaFX thread'inde çalışması gereken işlemler için kullanılır.
        Platform.runLater(()->{
            // Eğer kullanıcı tarafından gönderilen metin boş değilse,
            if (!chat_textField.getText().isEmpty())
            {
                // Kullanıcı tarafından gönderilen metin değişkenine atanır.
                String soru = chat_textField.getText();
                // reqFuncs sınıfındaki cevaplayici metodu çalıştırılır ve sonuç satirlayici metoduyla parçalanır.
                String cevapParcalayici = satirlayici(reqFuncs.cevaplayici(soru));
                // Mesaj oluşturucu metodu kullanılarak kullanıcı tarafından gönderilen metin ve cevap metni eklenir.
                mesajOlusturucu(false,satirlayici(soru));
                mesajOlusturucu(true,cevapParcalayici);

                // Chat ekranındaki listview son eklenen mesaja kaydırılır.
                chat_listView.scrollTo(chat_listView.getItems().size() - 1);
                // Listview güncellenir.
                chat_listView.refresh();
                // Metin alanı temizlenir.
                chat_textField.setText("");
            }
        });
    }

    ReqFuncs reqFuncs = new ReqFuncs();

    /**
     * ana oge tamamen islendikten sonra bir denetleyiciyi baslatmak icin cagrılır.
     * @param url kok nesne icin goreli yollari cozmek icin kullanilan konum.
     * @param resourceBundle kok nesneyi yerellestirmek icin kullanilan kaynaklar.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        // ListView'in hücrelerini özel bir görüntüleme sınıfı ile ayarlama
        chat_listView.setCellFactory(new Callback<ListView<TextData>, ListCell<TextData>>() {
            @Override
            public ListCell<TextData> call(ListView<TextData> listView) {
                return new ChatCustomListCell(); // Özel olarak tasarım yapılan hücre sınıfını döndürür
            }
        });

        // ListView'e çift tıklama olayını tanımlama
        chat_listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {

                    // İkinci kez tıklanan hücredeki metin
                    String text = chat_listView.getSelectionModel().getSelectedItem().getText();

                    // URL formatındaki metinleri belirleme
                    String regex = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(text);

                    // Eşleşen bir URL bulunursa
                    while (matcher.find()) {

                        // URL'yi panoya kopyalama
                        ClipboardContent clipboardContent = new ClipboardContent();
                        clipboardContent.putString(matcher.group());
                        Clipboard.getSystemClipboard().setContent(clipboardContent);

                        // Bilgilendirme mesajı gösterme
                        reqFuncs.bildirimGoster("Bilgilendirme","Link Kopyalandı",matcher.group(), Alert.AlertType.INFORMATION);
                        break;
                    }
                }
            }
        });

        // Metin alanına ENTER tuşunun basılması durumunun tanımlanması
        chat_textField.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER){
                gonder(); // Metin gönderme fonksiyonunun çağrılması
            }
        });



    }


    /**
     * verilen parametrelere gore TextData nesnesi olusturarak listviewe ekler
     * @param bot mesajin sistem tarafindan olusturulup olusturulmadigini belirleyen parametre
     * @param text yazilacak mesaji belirten parametre
     */
    private void mesajOlusturucu(boolean bot, String text) {
        // Local saat formatı olarak "HH:mm:ss" şeklinde tanımlanıyor
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        // Metnin tutulacağı TextData nesnesi oluşturuluyor
        TextData textData = new TextData();
        textData.setTime(dtf.format(LocalDateTime.now()));

        // Eğer metin bot tarafından oluşturulacaksa
        if (bot) {
            // İsim olarak "Balıkesir Üniversitesi ChatBot" belirleniyor
            textData.setName("Balıkesir Üniversitesi ChatBot");
            // Bot değişkeni true olarak belirleniyor
            textData.setBot(true);
        } else {
            // Eğer metin kullanıcı tarafından oluşturulacaksa
            // İsim olarak "User" belirleniyor
            textData.setName("User");
            // Bot değişkeni false olarak belirleniyor
            textData.setBot(false);
        }
        // Mesaj metni TextData nesnesine kaydediliyor
        textData.setText(text);

        // Oluşturulan TextData nesnesi chat_listView'in öğelerine ekleniyor
        chat_listView.getItems().add(textData);
    }


    /**
     * onceden belirlenmis kelime sayisine gore text parametresini satırlara ayırır ve yazının yana dogru uzaması yerine alt alta satır formatına donusmesini saglar
     * @param text satirlara ayrilacak text parametresi
     * @return verilen text bilgisini belirlenen kelime sayisina gore satirlara ayirarak string nesnesi olarak dondurur
     */
    private String satirlayici(String text) {
        // Sorunun null olup olmadığı kontrol edilir
        if (text == null) {
            return "Üzgünüm Soruyu Anlayamadım";
        } else {
            // Sorunun kelimelere ayrılması
            String[] kelimeler = text.split(" ");
            // Bir satır nesnesi oluşturulur
            StringBuilder satir = new StringBuilder();

            // Bir sonuç nesnesi oluşturulur
            StringBuilder sonuc = new StringBuilder();

            // Kelimeler kontrol edilir
            for (String word : kelimeler) {
                // Eğer satır + kelime uzunluğu + 1 100'den küçükse, kelime satır değişkenine eklenir
                if (satir.length() + word.length() + 1 <= 100) {
                    satir.append(word).append(" ");
                } else {
                    // Değilse, satır sonuc nesnesine eklenir ve yeni bir satır nesnesi oluşturulur
                    sonuc.append(satir.toString());
                    sonuc.append(System.lineSeparator());
                    satir = new StringBuilder();
                    satir.append(word).append(" ");
                }
            }
            // Son satır sonuc nesnesine eklenir
            sonuc.append(satir.toString());
            // Sonuç döndürülür
            return sonuc.toString();
        }
    }


}
