package model;

/**
 * Created by Yıldırım on 3/14/2016.
 */
public class Haber {

    private String mBaslik;
    private String mAciklama;

    public Haber(String baslik, String aciklama) {

        this.mBaslik= baslik;
        this.mAciklama= aciklama;
    }

    public String getBaslik() {
        return mBaslik;
    }

    public void setBaslik(String mBaslik) {
        this.mBaslik = mBaslik;
    }

    public String getAciklama() {
        return mAciklama;
    }

    public void setAciklama(String mAciklama) {
        this.mAciklama = mAciklama;
    }
}
