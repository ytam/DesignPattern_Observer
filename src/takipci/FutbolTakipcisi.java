package takipci;

import haberYonetimi.SporHaberleri;

/**
 * Created by Yıldırım on 3/14/2016.
 */
public class FutbolTakipcisi implements Takipci {


    private String mİsim;
    public FutbolTakipcisi(String isim) {
        this.mİsim=isim;
    }

    @Override
    public void update(SporHaberleri sporHaberleri) {

        System.out.println(String.format("%s isimli aboneye %s başlıklı haber gitti",
              this.mİsim ,sporHaberleri.getHaber().getBaslik()));

    }
}
