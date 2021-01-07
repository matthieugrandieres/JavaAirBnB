package matthieu.airbnb.logements;

import matthieu.airbnb.utilisateurs.Hote;

public class Appartement extends Logement{

    private int numeroEtage;
    private int superficieBalcon;


    public Appartement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax, int paramNumeroEtage,
                       int paramSuperficieBalcon) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        numeroEtage = paramNumeroEtage;
        superficieBalcon = paramSuperficieBalcon;
    }

    @Override
    public void afficher() {
        super.afficher();
        if (numeroEtage < 1 ) {
            System.out.println("Le logement est un appartement situé " + getAdresse() + " au rez-de-chaussée étage");
        } else {
            System.out.println("Le logement est un appartement situé " + getAdresse() + " au " + numeroEtage + " étage");
        }

        System.out.println("Superficie : " + getSuperficie() + " m2");
        if (superficieBalcon < 1 ) {
            System.out.println("Balcon : non");
        } else {
            System.out.println("Balcon : Oui (" + superficieBalcon +")");
        }

    }
}
