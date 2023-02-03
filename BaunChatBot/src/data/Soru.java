package data;


/**
 * Bu sinif, sorular ve cevaplari saklamak icin kullanilan bir Java sinifidir.
 * Sinif icinde, sorunun ID numarasi, soru metni, cevap metni ve sorunun cevapla eslesme yuzdesi gibi bilgiler bulunur.
 * Bunlarin her birine ait getter ve setter metodlari mevcuttur.
 * Ayrica, sinifin bir constructor metodu da mevcuttur ve bu metod ile sinif nesnesi olusturulurken sorunun ID numarasi,
 * soru metni ve cevap metni gibi bilgilerin girilmesi mumkundur.
 */
public class Soru {

    private int id;
    private String soru;
    private String cevap;

    private double eslesmeYuzdesi;

    public Soru(int id, String soru, String cevap) {
        this.id = id;
        this.soru = soru;
        this.cevap = cevap;
    }

    public double getEslesmeYuzdesi() {
        return eslesmeYuzdesi;
    }

    public void setEslesmeYuzdesi(double eslesmeYuzdesi) {
        this.eslesmeYuzdesi = eslesmeYuzdesi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }
}
