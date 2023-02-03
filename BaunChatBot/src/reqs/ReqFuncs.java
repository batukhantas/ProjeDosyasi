package reqs;

import data.Soru;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Soru ve cevapların tutulduğu sınıf.
 */
public class ReqFuncs {


    /*Soruların içerisinde Tutulacağı Liste**/
    ArrayList<Soru> sorular = new ArrayList<>();

    public ReqFuncs() {

        /*constructor metodunda yazılan soru nesnelerini sorular değişkenine eklenir**/

        sorular.add(new Soru(0,"Yeni kayıt yaptırdım. Öğrenci Bilgi Sistemine girmek için şifreyi nasıl temin edebilirim?",
                "Balıkesir Üniversitesi OBS üzerinden dolduracağınız ön kayıt formunda belirteceğiniz mail adresine şifreniz gönderilecektir."));

        sorular.add(new Soru(1,"Üniversitenizin örgün öğretim programına bu sene yerleştim. Fakat sitemde neden harç borcu gözükmektedir?",
                "Kayıtlı olup sildirmediğiniz bir yükseköğretim kurumunda kaydınız aktif olarak gözüküyorsa harç borcu çıkacaktır. En kısa sürede kayıt sildirme işini gerçekleştirerek kazandığınız okulun öğrenci işlerine bilgi veriniz."));

        sorular.add(new Soru(2,"Bölüme ilk kez Güz yarıyılında kayıt yaptırdım. OBS’ den ders seçip kaydettirmem gerekiyor mu?",
                "Üniversitemizde herhangi bir telafi eğitimi yapılmamaktadır. Diğer öğrencilerle birlikte ara sınavlara girebilirsiniz."));

        sorular.add(new Soru(3,"Ek kontenjandan kayıt yaptıran öğrencilere telafi eğitimi yapılıyor mu? Ara sınavları ne zaman yapılıyor?",
                "Evet. Tüm yarıyıllarda (1.sınıf dahil) tüm öğrencilerin OBS’ye ders kayıt süresi içerisinde girerek yalnızca kendi yarıyılına ait dersleri seçerek danışmana gönder butonundan onaylanması için göndermeleri gerekmektedir."));

        sorular.add(new Soru(4,"Öğrenci Belgemi nereden alabilirim?",
                "Fakülteniz/yüksekokulunuzun öğrenci işlerinden veya e-devlet üzerinden alabilirsiniz."));

        sorular.add(new Soru(5,"Akademik takvimde belirtilen süreler içerisinde ders kaydımı yapmazsam ne olur?",
                "Belirtilen tarihlerde kaydını yenilemeyen öğrenci, mazereti, ilgili yönetim kurulunca kabul edilmek kaydıyla ders alma bırakma günlerinde ders seçimi yaparak kaydını yenileyebilir. Bu süre içinde de kaydını yenilemeyen öğrenci o yarıyıl kaydını yenilememiş sayılır ve öğrencilik haklarından yararlanamaz. Detaylı Bilgi https://www.balikesir.edu.tr/upload/202208160806/files/2-%20Ders_Alma_Kayit_Yenileme.pdf"));

        sorular.add(new Soru(6,"Güz yarıyılı ders kaydı yaptırmadım. Bir sonraki yarıyıl (bahar) ders kaydı yaptırabilir miyim?",
                "Evet."));

        sorular.add(new Soru(7,"Ders seçme ekranında alacağım dersler çıkmıyor ne yapmam gerekiyor?",
                "Ders planlarınıza bağlı olarak derslerinizin sistemde gözükmemesi ders kaldırılmış, dersin kodu değişmiş, ders açılmamış veya eksik açılmış olabilir. Bu durumda danışmanınızla irtibata geçiniz."));

        sorular.add(new Soru(8,"Seçmeli derslerde kontenjan dolu uyarısı veriyor dersi seçemiyorum ne yapmalıyım?",
                "Seçmeli derslerde kontenjan sayıları bölüm başkanlığınız tarafından belirlendiği için danışmanınızla irtibata geçiniz. Detaylı Bilgi https://www.balikesir.edu.tr/upload/202208160806/files/2-%20Ders_Alma_Kayit_Yenileme.pdf"));

        sorular.add(new Soru(9,"Ders kaydımı yaptım danışmana onaylanması için gönderdim. Onaylanma sürecini takip etmeli miyim?",
                "Evet. Danışman onayından emin olunuz. Ders Kayıt Formunun bir çıktısını mezun oluncaya kadar saklayınız. Detaylı Bilgi İçin https://www.balikesir.edu.tr/upload/202208160806/files/2-%20Ders_Alma_Kayit_Yenileme.pdf"));

        sorular.add(new Soru(10,"Ders ekleme/çıkarma nedir?",
                "Seçmiş olduğunuz derslerden açılmayan seçmeli ders olduğunda veya değiştirmek istediğiniz dersler için Akademik Takvimde belirtilen süreler içerisinde danışmanınızla irtibata geçerek yapabilirsiniz. Detaylı Bilgi İçin https://www.balikesir.edu.tr/upload/202208160806/files/2-%20Ders_Alma_Kayit_Yenileme.pdf"));

        sorular.add(new Soru(11,"Herhangi bir nedenle öğrenime ara vermek (kayıt dondurma) mümkün müdür?",
                "Evet. Öğrencilere, kanıtlayacakları önemli nedenlerin veya eğitim öğretimlerine katkıda bulunacak Üniversite dışı burs, staj, araştırma ve benzeri imkanların ortaya çıkması halinde ilgili yönetim kurulu kararı ile iki yarıyıla kadar izin verilebilir. Öğrenci eğitim-öğretim süresi içinde bu imkandan bir kez yararlanabilir. Öğrencinin izinden yararlanabilmesi için yarıyıl başlangıcından önce dekanlığa veya yüksekokul/meslek yüksekokulu müdürlüğüne başvurması gerekir."));

        sorular.add(new Soru(12,"II.Öğretim öğrencisiyim. Kayıt dondurmak istediğimde harç ücretimi yatırmak zorunda mıyım?",
                "Kayıt dondurma isteğiniz okulunuzun ilgili yönetim kurulunun kabul edilmesi durumunda öğrenim ücretinizi yatırmanıza gerek yoktur."));

        sorular.add(new Soru(13,"Geçerli bir mazereti olan öğrenci, en fazla ne kadar kayıt dondurabilir?",
                "En fazla iki yarıyıl kayıt dondurabilir."));

        sorular.add(new Soru(14,"Kayıt dondurma ile kayıt yaptırmamak arasında bir fark var mı?",
                "İzinli sayılan süreler eğitim-öğretimden sayılmaz."));

        sorular.add(new Soru(15,"Kayıtlı oldukları programı bırakarak veya mezun olduktan sonra tekrar ÖSYS’ye girip de yeni bir programa kayıt yaptıranlar önceden başardıkları derslerden muaf tutulabilmek için ne yapmalıdırlar?",
                "Fakülteye/yüksekokula/meslek yüksekokuluna ilk kez kayıt yaptıran öğrenciler, ilk iki hafta içinde daha önce öğrenim gördüğü yükseköğrenim kurumlarında aldığı ve başarılı olduğu dersler için muaf olmak istediği dersleri içeren bir dilekçeye onaylı transkript ve onaylı ders içerikleriyle ile ilgili birime başvurabilirler."));

        sorular.add(new Soru(16,"Daha önce aldığım ders/dersler için Dekanlığa/Müdürlüğe muafiyet dilekçesi verdim, muafiyet başvurum sonuçlanıncaya kadar bu derse kayıt yaptırıp devam etmeli miyim?",
                "Muafiyet talebinde bulunan öğrenciler muafiyet başvurusunda bulunmamış gibi OBS’den ders seçip danışmanlarına onaylatır ve bu ders/derslere devam ederler. Yönetim Kurulu’nun muafiyet talebini uygun görmesi halinde birim öğrenci işleri öğrencinin muaf oldukları dersleri işleyerek akademik dönemini günceller ve öğrencinin muaf olduğu dersleri ders seçme ekranından siler. Eğer öğrencinin intibakı bir üst sınıfa yapılmışsa akademik takvimde belirtilen ders ekleme/çıkarma tarihlerinde öğrenci, danışmanı nezaretinde ders ekleyebilir. Akademik takvimde belirtilen ders ekleme/çıkarma süresinin kaçırılmaması öğrencilerin mağdur olmamaları için önem arz etmektedir."));

        sorular.add(new Soru(17,"Üniversitenize dikey/yatay kayıt yaptırdım. Üniversitenizden muaf olduğum dersleri ve almam gereken dersleri nasıl öğrenebilirim?",
                "Üniversitemize bağlı programlara kayıt yaptırıp muafiyet başvurusunda bulunan her öğrenci için ilgili birimlerin muafiyet ve intibak komisyonu tarafından bir muafiyet çizelgesi hazırlanarak yönetim kurulu kararıyla birlikte öğrenciye tebliğ edilir."));

        sorular.add(new Soru(18,"Üniversitenize dikey geçiş ile kayıt hakkı kazandım. Kaçıncı sınıftan devam edebilirim?",
                "İlgili bölümünüzün muafiyet ve intibak komisyonunda başarılı olduğunuz dersler kredi ve içerik bakımından muaf olunan derslerin kredi toplamı, ders programında gösterilen yarıyıl kredi yükünün en az %75’inden fazla ise öğrenci bir sonraki yarıyıla intibak ettirilir. İlgili yarıyılda muaf olunmayan dersler intibak ettirilen yarıyılda öncelikle alınır. Belirtilen kriteri sağladığınız takdirde bir üst sınıftan intibakınız yapılır."));

        sorular.add(new Soru(19,"Yapılan muafiyet ve intibak komisyonu kararına itiraz etmek istiyorum. Ne yapmalıyım?",
                "Muafiyet işleminin kesinleşip tarafınıza bildirildiği tarihten itibaren en geç 5 iş günü içinde ilgili birime dilekçe ile itirazda bulunabilirsiniz."));

        sorular.add(new Soru(20,"Birinci sınıf öğrencisiyim. Kaç krediye kadar ders seçebilirim?",
                "Birinci sınıf öğrencileri kayıtlı olduğu yarıyıla ait bütün dersleri almakla yükümlüdür."));

        sorular.add(new Soru(21,"Genel not ortalamam 1.80 ‘ in altında kaç krediye kadar ders alabilirim?",
                "İkinci yarıyıl sonundan itibaren her yarıyıl sonunda genel not ortalaması 1.80’in altında olan ön lisans ve lisans öğrencileri, takip eden yarıyılda en fazla 24 kredilik derse kayıt yaptırabilir."));

        sorular.add(new Soru(22,"Genel not ortalamam 1.80’in üstünde kaç krediye kadar ders alabilirim?",
                "Genel not ortalaması her yarıyıl sonunda 1.80 ve üzerinde olan öğrenciler 30 kredilik derse kayıt yaptırabilirler."));

        sorular.add(new Soru(23,"Hangi durumda üst sınıftan ders alabilirim?",
                "İkinci yarıyıl sonundan itibaren her yarıyıl sonunda, genel not ortalaması 2.80 ve üstünde olan lisans öğrencileri; öğrenim gördüğü yarıyıllarda almadığı ders veya alıp başarısız olduğu ders olmamak şartı ile danışmanlarının onayı ile bir üst sınıftan kredi sınırları içerisinde kalarak derslere kayıt yaptırabilirler."));

        sorular.add(new Soru(24,"Kayıt yenileme sırasında öncelikle başarısız olunan ders mi alınmalıdır?",
                "Evet. Öncelikle başarısız olduğunuz ders/dersler ve kredi sınırları içinde alt yarıyılda almadığınız dersleri alıp seçerek kayıt yaptırmanız gerekmektedir."));

        sorular.add(new Soru(25,"Seçmeli dersten başarısız oldum. Yerine başka seçmeli ders seçebilir miyim?",
                "Evet. Seçimlik bir dersten FF, YZ veya DZ notlarından birini alan öğrenci, bu dersi tekrarlar veya danışmanının onayıyla, bu ders yerine başka bir seçimlik dersi alabilir. (OBS’den ders seçimi yaparken almak istediğiniz seçmeli dersi seçip yerine değiştirmek istediğiniz diğer seçmeli dersin yerine alıyorum işlemini yapmanız gerekmektedir.)"));

        sorular.add(new Soru(26,"Daha önce başarısız olduğum derslere devam zorunluluğum var mı?",
                "Hayır. Tekrarlanan derslerde önceki dönemde devam koşulu yerine getirilmişse, devam koşulu aranmaz."));

        sorular.add(new Soru(27,"Başarısız olduğum ders/derslerden önceki ara sınav notum geçerli olur mu?",
                "Hayır. Bu dersler için daha önceki dönemlerde alınan notlar geçersizdir."));

        sorular.add(new Soru(28,"Öğrenci yarıyıl içinde bir dersin ne kadarına devam etmek zorundadır?",
                "Derslere ve uygulamalara devam zorunludur. Kuramsal (teorik) saatlerin %30’undan, uygulama saatlerinin de %20’sinden fazlasına katılmayan öğrenci o dersin dönem sonu sınavına giremez."));

        sorular.add(new Soru(29,"Sınav sonuçlarına itiraz edebilir miyim?",
                "Evet. Ham notlara itiraz; ilgili fakülte, yüksekokul veya meslek yüksekokulu yönetimine, sınav sonuçlarının ilanını izleyen üç işgünü içerisinde yazılı olarak yapılır. İtirazlar, ilgili yönetim kurulunca yapılacak incelemeden sonra karara bağlanarak öğrenciye tebliğ edilir."));

        sorular.add(new Soru(30,"Ara sınavlarda mazeret sınavı yapılıyor mu ?",
                "Evet. Fakülte, yüksekokul ve meslek yüksekokullarında, ara sınavlardan herhangi birine haklı ve geçerli nedenlerle katılamayan öğrenciler için ilgili yönetim kurulu kararı ile mazeret sınavı yapılabilir."));

        sorular.add(new Soru(31,"Mazeret sınavına girmek için almış olduğum sağlık raporunu kaç gün içinde nereye vermem gerekir?",
                "Öğrenciler, mazeretlerine ilişkin isteklerini, mazeretin bitiminden bir hafta içerisinde ilgili Dekanlık/Müdürlüklere dilekçe ile bildirirler. Bu süre içinde başvuru yapmayanlar bu haklarını kullanmaktan vazgeçmiş sayılır."));

        sorular.add(new Soru(32,"Yarıyıl sonu/ Bütünleme sınavlarının mazeret sınav hakkı var mı?",
                "Hayır."));

        sorular.add(new Soru(33,"Ara sınav ve yarıyıl sonu sınavları ortalama hangi oranlarda etki eder.",
                "Dönem içi değerlendirmelerin başarı notuna katkısı % 40, dönem sonu değerlendirmelerinin başarı notuna katkısı % 60 olarak hesaplanır."));

        sorular.add(new Soru(34,"Devamsızlıktan kaldığım dersin bütünleme sınavına girebilir miyim?",
                "Bir dersten devamsızlıktan kalan öğrenci o dersin bütünleme sınavına giremez."));

        sorular.add(new Soru(35,"Bir dersin bağıl değerlendirilebilmesi için en az kaç öğrencinin dersi alması gerekir?",
                "En az 11 öğrencinin dersi alması gerekmektedir."));

        sorular.add(new Soru(36,"Sınıf ortalamamız 80 ve üstü ise bağıl değerlendirme nasıl yapılır?",
                "Sınıf ortalaması 80 ve üstü olan öğrenciler Tablo-1’e göre değerlendirilirler.(Bkz.Öğrenci İşleri Daire Başkanlığı -Yönergeler -Bağıl Değerlendirme Yönergesi)"));

        sorular.add(new Soru(37,"Not yükselmek amacıyla aldığım dersten başarısız veya düşük not aldım eski notum geçerli olur mu?",
                "Her zaman en son alınan not geçerlidir."));

        sorular.add(new Soru(38,"Yüzde ona girme koşulları nelerdir?",
                "Aşağıdaki adreste yüzde ona girme koşulları belirtilmiştir:\n" +
                        "http://www.balikesir.edu.tr/index.php/baun/birim/ogrenci_isleri_daire_baskanligi/dhe/4813"));

        sorular.add(new Soru(39,"Azami Öğrenim Süresi Ve Kayıt Silme",
                "Bu konu Hakkında Detaylı bilgi için https://www.balikesir.edu.tr/upload/202208160757/files/0-%20Azami_Ogrenim_Suresi_ve_kayit_silme.pdf"));

        sorular.add(new Soru(40,"Diplomamı Kaybettim. İkinci Nüsha Diplomamı Nasıl Alabilirim?",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirisiniz https://www.balikesir.edu.tr/upload/202208161053/files/15-%20Diplomami_Kaybettim_%C4%B0kinci_Nusha_Diplomami_Nasil_Alabilirim.pdf"));

        sorular.add(new Soru(41,"Mezun Oldum Diplomamı Nasıl Alabilirim?",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirsiniz https://www.balikesir.edu.tr/upload/202208161045/files/14-%20Mezun_Oldum_Diplomami_%20Nasil_Teslim_Alabilirim.pdf"));

        sorular.add(new Soru(42,"Özel Öğrenci Statüsünde Ders Alma Talepleri",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirsiniz \n1- https://www.balikesir.edu.tr/upload/202208161045/files/14-%20Mezun_Oldum_Diplomami_%20Nasil_Teslim_Alabilirim.pdf\n2-https://www.balikesir.edu.tr/upload/202208161039/files/13-b%20_Ozel_Ogrenci_Olarak_Baska_Universite_Ogrencilerinin_Fakultemizden_Ders_Almalari.pdf"));

        sorular.add(new Soru(43,"Ders İçerikleri (Bilgi Paketi/Ders Kataloğu)",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirsiniz https://www.balikesir.edu.tr/upload/202208161037/files/12-%20Ders_%C4%B0cerikleri%20(Bilgi%20Paketi%20Ders%20Katalogu).pdf"));

        sorular.add(new Soru(44,"OBS den onaylı Türkçe-İngilizce Transkript, Öğrenci Belgesi, Disiplin Durum Belgesi belgeleri talebi için iş akışı",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirsiniz https://www.balikesir.edu.tr/upload/202203021057/files/Ogrenci_Belgesi_icin.pdf"));


        sorular.add(new Soru(45,"OBS'den Öğrenci Belgesi alma adımları",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirsiniz https://www.balikesir.edu.tr/upload/202203021057/files/Ogrenci_Belgesi_icin.pdf"));

        sorular.add(new Soru(46,"Tek Ders Sınavı ve Başvuru",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirsiniz https://www.balikesir.edu.tr/upload/202208180806/files/10-%20Tek_Ders_Sinavi_ve_Basvuru.pdf"));

        sorular.add(new Soru(47,"Mazeret Sınavı Nedir",
                "Ara sınavlara haklı ve geçerli nedenlerle katılamayan öğrenciler için yönetim kurulu kararı ile mazeret sınavı yapılır. Belirlenen tarihte mazeret sınavlarına herhangi bir nedenle giremeyen öğrenci için yeniden mazeret sınavı açılmaz."));

        sorular.add(new Soru(48,"Kayıt Sildirme",
                "Bu Konu Hakkında Detaylı Bilgi İçin Adresi Ziyaret Edebilirsiniz https://www.balikesir.edu.tr/upload/202208161030/files/8-%20%C4%B0lisik_kesme.pdf"));

        sorular.add(new Soru(49,"Mazeret Sınavına Katılmak İçin Nasıl Başvuru Yapabilirim?",
                "Öğrenciler,Mazeret sınavlarına katılmak isteyen Fakültemiz öğrencilerinin; Mazeretin kabulü için haklı ve geçerli nedenleri kanıtlayan resmi belgelerle beraber,mazeretin sona ermesinden itibaren bir hafta içinde\n" +
                        "Balıkesir Üniversitesi Mühendislik Fakültesi web sayfasında Öğrenci menüsündeki Formlar&Dilekçeler menüsünde bulunan Mazeret Sınavı Talep Dilekçesi ni doldurup imzalayarak\n" +
                        "(ekine mazeretini kanıtlayan resmi belgeyi ekleyerek) Dekanlık Öğrenci İşleri Bürosuna teslim etmeleri gerekmektedir. Bu süre içinde başvuru yapmayanlar bu haklarını kullanmaktan vazgeçmiş\n" +
                        "sayılır. "));

        sorular.add(new Soru(50,"Resmi onaylı mazeret belgemi kaç gün içinde teslim etmem gerekir?",
                "Öğrenciler,Mazeret sınavlarına katılmak isteyen Fakültemiz öğrencilerinin; Mazeretin kabulü için haklı ve geçerli nedenleri kanıtlayan resmi belgelerle beraber,mazeretin sona ermesinden itibaren bir hafta içinde\\n\" +\n" +
                        "Balıkesir Üniversitesi Mühendislik Fakültesi web sayfasında Öğrenci menüsündeki Formlar&Dilekçeler menüsünde bulunan Mazeret Sınavı Talep Dilekçesi ni doldurup imzalayarak\\n\" +\n" +
                        "(ekine mazeretini kanıtlayan resmi belgeyi ekleyerek) Dekanlık Öğrenci İşleri Bürosuna teslim etmeleri gerekmektedir. Bu süre içinde başvuru yapmayanlar bu haklarını kullanmaktan vazgeçmiş\\n\" +\n" +
                        "sayılır. "));

        sorular.add(new Soru(51,"Öğrenimden izinli sayılma (kayıt dondurma) talebimi nasıl yapmalıyım?",
                "Balıkesir Üniversitesi Mühendislik Fakültesi web sayfasında Öğrenci menüsündeki Formlar&Dilekçeler menüsünde bulunan Kayıt Dondurma (Öğrenimden İzinli Sayılma) Talep Dilekçesi ni doldurup imzalayarak ekine mazeretlerini kanıtlayan belgeyi de ekleyerek yarıyıl başlangıcından önce Dekanlığa teslim etmeleri gerekmektedir. Talepler Fakülte Yönetim Kurulunda değerlendirilecek ve uygun olup\n" +
                        "olmadığına karar verilecektir. Öğrenciler kayıt dondurma talep dilekçelerini ve mazeretlerini kanıtlayan ek belgelerini şahsen Fakülteye gelerek teslim edebilirler ya da Balıkesir Üniversitesi\n" +
                        "Mühendislik Fakültesi Çağış Yerleşkesi (Bigadiç yolu üzeri 17. km) 10145, BALIKESİR adresine kargo ile gönderebilirler. (Kargo gecikmelerinden Dekanlığımız sorumlu değildir.)"));

        sorular.add(new Soru(52,"Kayıt dondurmak istediğimde öğrenim ücreti/katkı payı ödemek zorunda mıyım?",
                "Fakülte Yönetim Kurulu kararı ile izin verilen öğrencilerden Üniversiteye kayıt olduğu ilk yarıyıl hariç katkı payı/öğrenim ücreti alınmaz. "));

        sorular.add(new Soru(53,"Geçerli bir mazereti olan öğrenci, en fazla ne kadar kayıt dondurabilir?",
                " En fazla iki yarıyıl kayıt dondurabilir. "));

        sorular.add(new Soru(54,"Kayıt dondurmak ile kayıt yaptırmamak arasında bir fark var mı?",
                " İzinli sayılan süreler eğitim-öğretim süresinden sayılmaz."));

        sorular.add(new Soru(55,"Sınav sonuçlarına nasıl itiraz edebilirim?",
                "Ham notlara itiraz etmek isteyen Fakültemiz öğrencilerinin; sınav sonuçlarını izleyen iki iş günü içerisinde Balıkesir Üniversitesi Mühendislik Fakültesi web sayfasında Öğrenci menüsündeki\n" +
                        "Formlar&Dilekçeler menüsünde bulunan Maddi Hata Dilekçesini doldurup imzalayarak İlgili Bölüm Sekreterliklerine teslim etmeleri gerekmektedir. Sınavlara itiraz MADDE 24 – (1) Sınav sonuçları, ham not/sayısal başarı notu\n" +
                        "olarak sınavın yapıldığı tarihten itibaren beş gün içerisinde ilan edilir. Ham notlara itiraz; ilgili fakülte, yüksekokul veya meslek yüksekokulu yönetimine, sınav sonuçlarının ilanını izleyen (Değişik ibare:RG13/1/2022-31718) iki işgünü içerisinde yazılı olarak yapılır. İtirazlar,\n" +
                        "ilgili yönetim kurulunca yapılacak incelemeden sonra karara bağlanır. Tek ders sınav sonuçlarının ilanı ve itiraz süreleri Senato tarafından belirlenir"));

        sorular.add(new Soru(56,"Yarıyıl/yıl sonu başarı notumun en az kaç olması gerekir?",
                "YSSL değeri 50 olarak uygulanır. 100 puan üzerinden 50’nin altında not alan öğrenciler başarısız sayılır ve doğrudan FF notu verilir. Ancak bu öğrenciler bağıl değerlendirmeye dahil edilirler."));

        sorular.add(new Soru(57,"Ara sınav ve yarıyıl sonu sınavlarının başarı notuna katkı oranları nedir?",
                "Yarıyıl içi değerlendirmelerin başarı notuna katkısı %40, yarıyıl sonu değerlendirmelerinin başarı notuna katkısı ise %60 olarak hesaplanır."));

        sorular.add(new Soru(58,"Not yükselmek amacıyla aldığım dersten başarısız veya düşük not aldım eski notum geçerli olur mu?\n",
                "Her zaman en son alınan not geçerlidir.\n"));


        sorular.add(new Soru(59,"Ders Muafiyeti Nedir",
                "Balıkesir Üniversitesine kayıt hakkı kazanan öğrencilerin; Balıkesir Üniversitesi dahil olmak üzere herhangi bir Yükseköğretim Kurumundan daha önce alıp başardığı ders/dersler karşılığında, hangi\n" +
                        "ders/derslerden muaf olabileceğini ve yarıyıl/yıl intibak esaslarını belirlemektir. Fakültemiz Bölümlerinin Ders Planlarına (Müfredatlarına) aşağıdaki link adresindenulaşabilirsiniz.\n" +
                        "https://www.balikesir.edu.tr/site/duyuru/9918"));


        sorular.add(new Soru(60,"Ders Muafiyeti Başvurumu Ne zaman Yapmalıyım? Başvuru Süresi Ne kadar?",
                "Üniversiteye ilk kez kayıt yaptıran öğrenciler, kayıt olduğu eğitim-öğretim yılının ikinci haftasının sonuna kadar daha önce öğrenim gördükleri yükseköğretim kurumlarından aldıkları ve başarılı\n" +
                        "oldukları derslerden muaf olmak istediklerini belirten dilekçelerini kayıtlı oldukları Fakülte Dekanlığına verirler. Başvurular Balıkesir Üniversitesi Muafiyet ve İntibak İşlemleri Yönergesi\n" +
                        "çerçevesinde değerlendirilir. Lütfen Yönergeyi okuyunuz"));


        sorular.add(new Soru(61,"Ders Muafiyeti Başvurumu Nasıl Yapmalıyım?",
                "(1) Balıkesir Üniversitesi Mühendislik Fakültesine kayıt hakkı kazanan öğrencilerin, muaf olmak istedikleri dersleri bildiren Mühendislik Fakültesi web sayfasında Öğrenci menüsündeki Öğrenci formları menüsünde bulunan Ders Muafiyet\n" +
                        "Formunu doldurup imzalayarak, dilekçelerine onaylanmış not döküm belgesini (transkript) ve onaylı ders içeriklerini eklemeleri gerekir. İnternet adresi (tam bağlantı adresi) belirtilen ders içeriklerinin çıktıları ile doğrulama kodu olan not döküm belgeleri kabuledilir.\n" +
                        "(2) Öğrenciler, daha önce almış ve başarmış oldukları ders/dersler karşılığında hangi ders/derslerden muaf olmak istediklerini başvuru dilekçelerinde belirtmek zorundadır. (3) Öğrenciler, daha önce almış oldukları ve başarmış oldukları birden fazla derse karşılık muadil\n" +
                        "ders/derslerden muafiyet isteğinde bulunabilirler.\n"));

        sorular.add(new Soru(62,"Ders Muafiyeti Kimleri Kapsar?",
                "Daha önce alıp, başarılı oldukları derslerden muafiyet ve intibak talebi yapabilecek öğrenciler\n" +
                        "aşağıda belirtilmiştir.\n" +
                        "a) Yatay/Dikey geçiş yaparak veya 6111 sayılı Kanundan yararlanarak öğrenimlerine devam etmek\n" +
                        "isteyen öğrenciler.\n" +
                        "b) Daha önce herhangi bir Yükseköğretim Kurumu’nda öğrenci veya mezun iken Balıkesir\n" +
                        "Üniversitesi’ne yeniden kayıt yaptırmaya hak kazanan öğrenciler.\n" +
                        "c) Balıkesir Üniversitesi programlarından birinde kayıtlı bulunan öğrencilerden, Yükseköğretim\n" +
                        "Kurulu (YÖK) tarafından denkliği kabul edilen başka bir yükseköğretim kurumunun programlarında\n" +
                        "özel öğrenci statüsünde ders alanlar, Farabi Programı, Uluslararası Değişim Programları ile\n" +
                        "yurtdışında öğrenim gören öğrenciler.\n" +
                        "ç) Yukarıda belirtilen veya benzeri durumda olup öğrenimlerine devam edecek öğrenciler."));




        sorular.add(new Soru(63,"azami ögrenim süresi nedir?",
                "Bu Konu Hakkında Detaylı Bilgi için Adresi ziyaret edebilirsiniz https://www.balikesir.edu.tr/upload/202208160757/files/0-%20Azami_Ogrenim_Suresi_ve_kayit_silme.pdf"));

        sorular.add(new Soru(64,"Kayıt Silme Nasıl Yapılır?",
                "Bu Konu Hakkında Detaylı Bilgi için Adresi ziyaret edebilirsiniz https://www.balikesir.edu.tr/upload/202208160757/files/0-%20Azami_Ogrenim_Suresi_ve_kayit_silme.pdf"));




    }


    /**
     * verilen kelimelerin kacinci soru icerisinde bulundugunu yuzdesel olarak hesaplar
     * @param soru disaridan girilen karsilastirilacak soru degiskeni
     * @param kelimeler karsilasitrmada kullanilacak kelime dizizsi
     * @return eslesen kelime sayisinin yuzdesini dondurur
     */
    private double soruEslemeYuzdesi(Soru soru,String[] kelimeler) {

        // Değişken tanımlama: Eşleşen kelime sayısını tutacak bir değişken oluşturuyoruz
        double eslesenKelimeSayisi = 0;

        // Her bir kelime için:
        for (String kelime : kelimeler) {
            // Sorunun içeriği, puncuationlar haricinde, kelime içeriyor mu kontrol ediyoruz
            if (soru.getSoru().toLowerCase(Locale.ROOT).replaceAll("\\p{Punct}", "").contains(kelime)) {
                // Eğer içeriyorsa eşleşen kelime sayısını artırıyoruz
                eslesenKelimeSayisi += 1;
            }
        }

        // Sorunun kelime sayısını belirliyoruz
        int soruKelimeSayisi = soru.getSoru().split(" ").length;

        // Eşleşme yüzdesini hesaplıyoruz: Eşleşen kelime sayısı / Sorunun kelime sayısı * 100
        double yuzde =  (eslesenKelimeSayisi / soruKelimeSayisi) * 100;

        // Hesaplanan eşleşme yüzdesini soru objesinin ilgili özelliğine atıyoruz
        soru.setEslesmeYuzdesi(yuzde);

        // Hesaplanan eşleşme yüzdesini döndürüyoruz
        return yuzde;

    }


    /**
     * verilen soru listesi icerisindeki en yuksek eslesme yuzdesine sahip soruyu bulur
     * @param sorular disaridan girilen soru listesi
     * @return sorular icerisindeki en yuksek eslesme yuzdesine sahip soruyu dondurur
     */

    private Soru eslesenSoruyuBulma(ArrayList<Soru> sorular) {

        //enyakınsoru değişkenini başlangıç  değerini null olarak atandı
        Soru enYakinSoru = null;
        // double tipinde , eşleşme yüzdesini tutacak max değişkeni başlangıçta sıfır olarak atandı
        double max = 0;

        //soruların bastan sonra kontrol edilmesi icin dongu olusturuldu
        for (int i=0;i<sorular.size();i++) {

            //soru eslesme yuzdesi max degerinden buyuk olup olmadıgı kontrol edildi
            //eger soru eslesme yuzdesi max degerinden buyuk ise if blogu calisacak
            if (sorular.get(i).getEslesmeYuzdesi() > max) {

                //max degeri sorunun eslesme yuzdesiyle degistirildi
                max = sorular.get(i).getEslesmeYuzdesi();

                //donuste soru bilgilerini dondurebilmek icin en yakin soru degiskenine secili soru degeri atanadı
                enYakinSoru = sorular.get(i);
            }
        }

        //eslesme ortalamasi (max) 40 degerinden kucuk ise null degeri donduruldu
        if (max < 40)
        {
            return null;
        }
        else
        {
            return enYakinSoru;
        }

        
    }


    /**
     * girilen String degerinin karsilama mesaji olup olmadigini kontrol eder
     * @param soru kontrol edilecek soru parametresi
     * @return karsilamaMesaji ise true degil ise false dondurur
     */
    private boolean karsilamaMesajiTespit(String soru) {


        boolean eslesme = false;

        //karsilama mesaji oldugunu anlamak icin kullanilacak kelimeler
        String[] kelimeler = {"merhaba","naber","nasılsın","selam","selamlar","iyi günler, bir sorum var","iyi akşamlar, bir sorum var","günaydın"};

        //kelimelerin sorunun icerisinde olup olmadigini kontrol etmek icin dongu olusturuldu
        for (String kelime : kelimeler) {

            //soru belirlenen kelimeleri iceriyorsa if blogu calistirildi
            if (soru.contains(kelime)){

                //eslesme degiskeni true olarak ayarlandı
                eslesme = true;

                //donguden çıkıldı
                break;
            }
        }


        return eslesme;

    }


    /**
     * girilen String degerinin ayrilma mesaji olup olmadigini kontrol eder
     * @param soru kontrol edilecek soru parametresi
     * @return ayrilmaMesaji ise true degil ise false dondurur
     */
    private boolean ayrilmaMesajiTespit(String soru) {

        boolean eslesme = false;

        //ayrilma mesaji oldugunu anlamak icin kullanilacak kelimeler
        String[] kelimeler = {"teşekkürler","sağol","sağolasın","görüşürüz","görüşmek üzere","hoşçakal","çok teşekkürler"};

        //kelimelerin sorunun icerisinde olup olmadigini kontrol etmek icin dongu olusturuldu
        for (String kelime : kelimeler) {

            //soru belirlenen kelimeleri iceriyorsa if blogu calistirildi
            if (soru.contains(kelime)){

                //eslesme degiskeni true olarak ayarlandı
                eslesme = true;

                //donguden çıkıldı
                break;
            }
        }

        return eslesme;

    }


    /**
     * kullanicidan alinan soruya en uygun cevabi bulur
     * @param kullaniciSorusu kullanıcı sorusunu kelimelere ayırıp sormak istediği soruyu tespit eder
     * @return eslesen sorunun cevabini dondurur eslesme yoksa defaul cevabı dondurur
     */

    public String cevaplayici(String kullaniciSorusu) {

        //verilen sorunun karsilama mesaji olup olmadigi kontrol ediliyor
        if (karsilamaMesajiTespit(kullaniciSorusu)) {
            return "BaunChatBot'a hoşgeldin, sana nasıl yardımcı olabilirim?";
        }
        //verilen sorunun ayrilma mesaji olup olmadigi kontrol ediliyor
        else if (ayrilmaMesajiTespit(kullaniciSorusu)) {
            return "İletişime geçtiğin için teşekkürler. Yardımcı olabileceğim başka konu var mı?";
        }
        else {

            //girilen sorunun tum karakterlerini kucuk harfe cevirip noktalama isaretlerini temizliyor ve ardindan split metodu ile kelimelere ayiriyoruz
            String[] kelimeler = kullaniciSorusu.toLowerCase(Locale.ROOT).replaceAll("\\p{Punct}", "").split(" ");

            //girilen sorunun hangi soru ile eslestigini tespit edebilmek icin dongu olusturuyoruz
            for (Soru soru : sorular) {

                //girilen soru ile dongudeki sorunun eslesme yuzdesini hesaplattiriyoruz
                soruEslemeYuzdesi(soru,kelimeler);
            }

            //sorular icerisindeki en yuksek eslesme oranina sahip soruyu eslesenSoru degiskenine atiyoruz
            Soru eslesenSoru = eslesenSoruyuBulma(sorular);

            if (eslesenSoru != null)
            {
                //eslesenSorunun cevap parametresini return ediyoruz
                return eslesenSoru.getCevap();
            }
            else {
                return "Üzgünüm, bu soruya cevap verebilecek düzeyde değilim.";
            }
        }





       


    }


    /**
     * ekranda bildirim penceresi olusturur
     * @param title bildirim ekraninin gorev cubugunda gorunen title parametresi
     * @param headerText baslik bilgisini iceren parametre
     * @param contentText konu bilgisini iceren parametre
     * @param type alert tipini ifade eden parametre
     * @return yes or no bilgisini geri donrurur
     */
    public Optional bildirimGoster(String title, String headerText, String contentText, Alert.AlertType type)
    {

        Alert alert = new Alert(type);

        // alert nesnesinin DialogPane nesnesinin Scene nesnesinin Window nesnesine erişilir
        Window window = alert.getDialogPane().getScene().getWindow();

        // Erişilen nesne (window) Stage tipinde cast edilir
        Stage stgs = (Stage) window;

        // Resmin URL'si alınıyor
        String imageURL = this.getClass().getResource("/images/logo4r.png").toExternalForm();

        // URL null olup olmadığı kontrol ediliyor
        Objects.requireNonNull(imageURL);

        // javafx.scene.image.Image sınıfı ile resim nesnesi oluşturuluyor
        Image logo = new Image(imageURL);

        // stgs nesnesine resim nesnesi ekleniyor
        stgs.getIcons().add(logo);

        // Başlık ve içerik metni belirliyor
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);

        // Bildirimi göster ve tepki sonucunu döndür
        Optional<ButtonType> result = alert.showAndWait();
        return result;
    }

}
