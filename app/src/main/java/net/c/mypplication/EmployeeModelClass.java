package net.c.mypplication;

public class EmployeeModelClass {
    Integer id;
    String ville;
    String prix;
    String surface;
    String nbPiece;

    public EmployeeModelClass(String ville, String prix, String surface, String nbPiece) {
        this.ville = ville;
        this.prix = prix;
        this.surface = surface;
        this.nbPiece = nbPiece;

    }

    public EmployeeModelClass(Integer id, String ville, String prix, String surface, String nbPiece) {
        this.id = id;
        this.ville = ville;
        this.prix = prix;
        this.surface = surface;
        this.nbPiece = nbPiece;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getNbPiece() {
        return nbPiece;
    }

    public void setNbPiece(String nbPiece) {
        this.nbPiece = nbPiece;
    }
}

