package data;
public class Voiture {
    private String marque;
    private int prix;

    public Voiture(String marque, int prix) {
        this.marque = marque;
        this.prix = prix;
    }
    public Voiture(){
        this.marque = "";
        this.prix = 0;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}