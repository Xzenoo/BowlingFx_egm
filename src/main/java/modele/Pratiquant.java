package modele;

public class Pratiquant {

//      ===attribut===
    private int id_Pratiquant;
    private String nom;
    private String prenom;
    private int cp;
    private String rue;
    private String ville;
    private String email;
    private String mdp;
    private String genre;
    private boolean estAdmin;

    public Pratiquant(int id_pratiquant, String nom, String prenom, int cp, String rue, String ville, String email,String mdp, String genre, boolean estAdmin) {
        this.id_Pratiquant =id_pratiquant;
        this.nom = nom;
        this.prenom =prenom;
        this.cp = cp;
        this.rue = rue;
        this.ville = ville;
        this.email = email;
        this.mdp = mdp;
        this.genre = genre;
        this.estAdmin = estAdmin;
    }


    public int getId_Pratiquant() {
        return id_Pratiquant;
    }

    public void setId_Pratiquant(int idPratiquant) {
        this.id_Pratiquant = idPratiquant;
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

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public boolean isEstAdmin() {
        return estAdmin;
    }

    public void setEstAdmin(boolean estAdmin) {
        this.estAdmin = estAdmin;
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
