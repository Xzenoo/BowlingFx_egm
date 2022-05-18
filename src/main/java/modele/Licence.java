package modele;

public class Licence {

    // ===Attribut===
    private int id_Licence;
    private int annee;
    private int ref_Club;

    //=== getter & setter


    public int getId_Licence() {
        return id_Licence;
    }

    public void setId_Licence(int id_Licence) {
        this.id_Licence = id_Licence;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getRef_Club() {
        return ref_Club;
    }

    public void setRef_Club(int ref_Club) {
        this.ref_Club = ref_Club;
    }
}
