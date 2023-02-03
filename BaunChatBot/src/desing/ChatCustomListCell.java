package desing;

import data.TextData;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.io.File;

/**
 * Bu, bir sohbet uygulamasi icin ozel bir ListCell olusturmaya yonelik bir JavaFX kodudur.
 * ListView'de bir hucre olan ListCell sinifini genisletir.
 * Metin verilerini bir TextData nesnesinden goruntulemek icin Metin, Cember ve farkli HBox ve VBox kapsayicilari gibi UI ogelerini ayarlar.
 * updateItem yontemi, parametre olarak iletilen TextData nesnesine gore hucreyi gunceller.
 * Mesaj bot tarafindan gonderildiyse, bot adi ve profil resmi (bir Cember nesnesi) gorunur olacak ve metin sola hizalanacaktir.
 * Mesaj kullanici tarafindan gonderildiyse bot adi ve profil resmi gizlenecek ve metin saga hizalanacaktir.
 */
public class ChatCustomListCell extends ListCell<TextData> {


    private HBox content;
    private VBox vBox;
    private Text name;
    private Text text;
    private Text time;
    private Circle circle;


    /**
     * sinifin nesnelerinin ozelliklerini belirleyen constructur metodu
     */
    public ChatCustomListCell() {

        super(); // Ana sınıfın (AbstractListCell) constructor metodunu çağır

        // Metnin görüntüleneceği Text nesneleri oluşturuluyor
        name = new Text();
        text = new Text();
        time = new Text();
        circle = new Circle(); // Profil resmi için Circle nesnesi oluşturuluyor

        // Metinlerin görüntüleneceği şekil ve font ayarları yapılıyor
        name.setFill(Color.BLACK);
        name.setStyle("-fx-font: 12 Calibri;");

        text.setFill(Color.BLACK);
        text.setStyle("-fx-font: 18 Calibri;");

        time.setFill(Color.LIGHTGREY);
        time.setStyle("-fx-font: 10 Calibri;");

        // Text nesnelerinin bulunduğu HBox oluşturuluyor
        HBox hBox = new HBox(text,time);
        hBox.setAlignment(Pos.BOTTOM_LEFT); // Metinler sola dayalı olsun
        hBox.setSpacing(5); // Metinler arasındaki boşluk 5 piksel olsun

        // HBox ve Circle nesnelerinin bulunduğu VBox oluşturuluyor
        vBox = new VBox(name,hBox);

        // Circle ve VBox nesnelerinin bulunduğu HBox oluşturuluyor
        content = new HBox(circle, vBox);

        // Circle nesnesinin yarıçapı ayarlanıyor
        circle.setRadius(25);

        // Circle nesnesinin çerçeve rengi ayarlanıyor
        circle.setStroke(Color.GRAY);

        // VBox'un padding değeri ayarlanıyor
        vBox.setPadding(new Insets(8, 8, 8, 8));
        // HBox'un padding ve spacing değerleri ayarlanıyor
        content.setSpacing(10);
        content.setPadding(new Insets(5, 5, 5, 5));

    }

    /**
     * verilen TextData verisine gore nesneyi gunceller
     * @param item nesne ozelliklerini ayarlamak icin verilen TextData parametresi
     * @param empty degerin bos olup olmadıgini bildiren parametre
     */
    @Override
    protected void updateItem(TextData item, boolean empty) {

        // Üst sınıfın metodunu çağırıyoruz
        super.updateItem(item, empty);

        // Eğer item boş değil ve null değilse yapılacak işlemler
        if (item != null && !empty)
        {
            // Eğer mesaj bot tarafından gönderilmişse
            if (item.isBot())
            {
                // Zaman rengi gri
                time.setFill(Color.GREY);
                // İsim rengi yeşil
                name.setFill(Color.GREEN);
                // VBox'ın stilini belirliyoruz
                vBox.setStyle("-fx-background-color:  white; -fx-border-radius: 10; -fx-background-radius: 10; -fx-border-color: black; -fx-border-width: 0.15");
                // İsim görünür
                name.setVisible(true);
                // Çember görünür
                circle.setVisible(true);
                // İçerik sola hizalanır
                content.setAlignment(Pos.CENTER_LEFT);
            }
            // Eğer mesaj kullanıcı tarafından gönderilmişse
            else
            {
                // Zaman rengi gri
                time.setFill(Color.GREY);
                // Çember görünmez
                circle.setVisible(false);
                // İsim görünmez
                name.setVisible(false);
                // İçerik sağa hizalanır
                content.setAlignment(Pos.CENTER_RIGHT);
                // VBox'ın stilini belirliyoruz
                vBox.setStyle("-fx-background-color:  #d9fdd3; -fx-border-radius: 10; -fx-background-radius: 10;-fx-border-color: black; -fx-border-width: 0.15");
            }

            // Çember dolduruluyor
            circle.setFill(new ImagePattern(new Image("images/logo4r.png")));
            // Zaman metninin içeriği set ediliyor
            time.setText(item.getTime());
            // İsim metninin içeriği set ediliyor
            name.setText(item.getName());
            // Metin metninin içeriği set ediliyor
            text.setText(item.getText());

            // İçerik set ediliyor
            setGraphic(content);
        }
        // Eğer item boş ise
        else
        {
            // Grafik null yapılıyor
            setGraphic(null);
        }
    }

}
