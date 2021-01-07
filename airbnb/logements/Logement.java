package matthieu.airbnb.logements;

import matthieu.airbnb.utilisateurs.Hote;

public class Logement {

    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Hote paramHote, int paramTarifParNuit,  String paramAdresse, int paramSuperficie, int paramNbVoyageursMax){
        hote = paramHote;
        tarifParNuit = paramTarifParNuit;
        adresse = paramAdresse;
        superficie = paramSuperficie;
        nbVoyageursMax = paramNbVoyageursMax;
    }

    public int getTarifParNuit(){
        return tarifParNuit;
    }

    public void afficher(){
        hote.afficher();
    }

    public String getAdresse(){
        return adresse;
    }

    public int getSuperficie(){
        return superficie;
    }

}
