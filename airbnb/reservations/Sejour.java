package matthieu.airbnb.reservations;

import matthieu.airbnb.logements.Logement;

import java.text.SimpleDateFormat;


public class Sejour implements SejourInterface{

    private String dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;

    public Sejour(String paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs){
        dateArrivee = paramDateArrivee;
        nbNuits = paramNbNuits;
        logement = paramLogement;
        nbVoyageurs = paramNbVoyageurs;
    }

    public void afficher(){
        System.out.println("La date d'arrivée est le " + dateArrivee + " pour " + nbNuits + ".");
        System.out.println("Le prix du sejour est de " + logement.getTarifParNuit() * nbNuits);
    }

    public String getLogementAdresse(){
        return logement.getAdresse();
    }

    public int getLogementSuperficie(){
        return logement.getSuperficie();
    }

    public int getNbNuits(){
        return nbNuits;
    }

    public int getLogementTarif(){
        return logement.getTarifParNuit();
    }

    public Logement getLogement(){
        return logement;
    }



}
