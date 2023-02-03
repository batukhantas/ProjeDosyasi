package data;

import javafx.scene.image.Image;

/**
 * Bu sinif, metin verilerini saklamak icin kullanilan bir Java sinifidir.
 * Sinif icinde, zaman, isim, metin ve bot olup olmadigi gibi bilgileri iceren ozellikler bulunur.
 * Bunlarin her birine ait getter ve setter metodlari mevcuttur.
 */
public class TextData {

    private String time;

    private String name;
    private String text;
    boolean isBot;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }
}
