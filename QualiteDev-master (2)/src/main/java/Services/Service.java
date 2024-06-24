package Services;

import data.Voiture;

import java.util.ArrayList;

public class Service implements Statistique {
    private ArrayList<Voiture> tabVoiture;

    public Service(ArrayList<Voiture> tabVoiture) {
        this.tabVoiture = tabVoiture;
    }


    @Override
    public void ajouter(Voiture voiture) {
        this.tabVoiture.add(voiture);

    }
    /**
     * Calcul d'un prix dégressif en fonction du nombre de voitures :
     * 5% de remise supplémentaire sur chaque voiture à chaque fois que 5 voitures sont ajoutées
     * et une remise maxi de 20 000 euros.
     * 5 pourcent de remise  s'effectue a chaque fois qu'il y a 5 voiture
     * @return le prix des voitures
     * @throws ArithmeticException s'il n'y a pas de voiture
     * a chaque ajout de 5 nouvelle voiture je mets 5% de remise au total
     */

    @Override
    public int prix() throws ArithmeticException {
        if (tabVoiture.isEmpty()){
            throw new ArithmeticException("pas de voiture");

        }
        int total = 0;
        int i = 0;
        for (Voiture voiture :tabVoiture ){
            total += voiture.getPrix();
            i++;
            if (i==5) {
                i=0;
                int remise = (int) (total*0.05);
                if(remise> 20000.0){
                    remise = (int) 20000.0;
                }
                total -= remise;
            }
        }


        return total;
    }

}