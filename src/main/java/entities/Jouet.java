package entities;

public class Jouet {
    private String nomJouet;
    private double prixJouet;
    private String descriptionJouet;

    public Jouet() {
    }
    
    public Jouet(String nomJouet, double prixJouet, String descriptionJouet) {
        this.nomJouet = nomJouet;
        this.prixJouet = prixJouet;
        this.descriptionJouet = descriptionJouet;
    }

    public String getNomJouet() {
        return nomJouet;
    }

    public void setNomJouet(String nomJouet) {
        this.nomJouet = nomJouet;
    }

    public double getPrixJouet() {
        return prixJouet;
    }

    public void setPrixJouet(double prixJouet) {
        this.prixJouet = prixJouet;
    }

    public String getDescriptionJouet() {
        return descriptionJouet;
    }

    public void setDescriptionJouet(String descriptionJouet) {
        this.descriptionJouet = descriptionJouet;
    }
}