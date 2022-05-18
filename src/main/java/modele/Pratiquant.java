package modele;

public class Pratiquant {

//      ===attribut===
    private int idPratiquant;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String mdp;
    private String genre;


    public int getIdPratiquant() {
        return idPratiquant;
    }

    public void setIdPratiquant(int idPratiquant) {
        this.idPratiquant = idPratiquant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
