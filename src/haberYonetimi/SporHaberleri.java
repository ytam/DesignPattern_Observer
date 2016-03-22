package haberYonetimi;

import model.Haber;
import takipci.Takipci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public abstract class SporHaberleri {

    private List<Takipci> takipciler;
    private List<Haber>haberler;
    private Haber mHaber;

    {
        takipciler= new ArrayList<Takipci>();
        haberler= new ArrayList<Haber>();
    }

    public void subscribe(Takipci takipci){
        takipciler.add(takipci);
    }

    public void unsubscribe(Takipci takipci){
        takipciler.remove(takipci);


    }
    public  void notifyChanges(){
        for (Takipci takipci: takipciler) {
            takipci.update(this);

            
        }
    }

    public  void addNewHaber(Haber haber){
        haberler.add(haber);
        this.mHaber=haber;
        notifyChanges();
    }

    public Haber getHaber() {
        return mHaber;
    }
}
