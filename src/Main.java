import haberYonetimi.FutbolHaberi;
import haberYonetimi.SporHaberleri;
import model.Haber;
import takipci.FutbolTakipcisi;
import takipci.Takipci;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public class Main {

    public static void main(String[] args){

        SporHaberleri futbolHaber= new FutbolHaberi();


        futbolHaber.subscribe(new FutbolTakipcisi("Yıldırım "));
        futbolHaber.subscribe(new FutbolTakipcisi("Brusk"));



        futbolHaber.addNewHaber(new Haber("1.Haber","1. Haberin açıklamsı"));

        futbolHaber.subscribe(new FutbolTakipcisi("muzo "));

        futbolHaber.addNewHaber(new Haber("2.Haber","2. Haberin açıklamsı"));

        futbolHaber.subscribe(new FutbolTakipcisi("Yusuf"));

        futbolHaber.addNewHaber(new Haber("3.Haber","3. Haberin açıklamsı"));


    }
}
