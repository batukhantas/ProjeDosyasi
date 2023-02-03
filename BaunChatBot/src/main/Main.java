package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

/**
 *  Uygulamayı çalıştırmak için kullanılan ve çalıştırıldığında başlangıçtaki olayları düzenleyen sınıf.
 *  @author BATUHAN TAŞ
 */
public class Main extends Application {


    /**
     * JavaFX uygulamalari icin ana giris noktasi. Baslatma yontemi, init yontemi donduruldukten ve sistem uygulamanin calişmaya baslamasi icin hazir olduktan sonra cagirilir.
     * @param stage ayarlanabilecegi bu uygulama icin birincil asama. Uygulama bir applet olarak baslatildiysa, birincil asama tarayiciya gomulecektir. Uygulamalar, gerekirse baska asamalar olusturabilir, ancak bunlar birincil asamalar olmayacak ve tarayiciya yerlestirilmeyecektir.
     */
    public void start(Stage stage) throws Exception {

        // FXMLLoader sınıfı kullanılarak mainScreen.fxml dosyası yükleniyor
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Objects.requireNonNull(getClass().getResource("/fxml/mainScreen.fxml")));
        Parent root = loader.load();
        // Resmin URL'si alınıyor
        String imageURL = this.getClass().getResource("/images/logo4r.png").toExternalForm();
        // URL null olup olmadığı kontrol ediliyor
        Objects.requireNonNull(imageURL);
        // javafx.scene.image.Image sınıfı ile resim nesnesi oluşturuluyor
        Image logo = new Image(imageURL);

        // Stage nesnesine resim nesnesi ekleniyor
        stage.getIcons().add(logo);

        // Stage başlığı ayarlanıyor
        stage.setTitle("BaunChatBot");

        // Scene olarak yüklenen "root" nesnesi belirleniyor
        Scene scene = new Scene(root);

        // Stage maksimize edilmemesi isteniyor
        stage.setMaximized(false);
        stage.setScene(scene);

        // Stage görüntüleniyor
        stage.show();

    }
}