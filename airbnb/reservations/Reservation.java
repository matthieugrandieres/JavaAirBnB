package matthieu.airbnb.reservations;
import matthieu.airbnb.utilisateurs.Personne;
import matthieu.airbnb.logements.Logement;
import matthieu.airbnb.utilisateurs.Voyageur;
import matthieu.airbnb.utilisateurs.Hote;

import java.util.Date;

public class Reservation {

    private int id;
    private Sejour sejour;
    private Voyageur voyageur;
    private boolean estValidee;
    private String dateDeReservation;
    private Hote hote;

    public Reservation(int pId, Sejour pSejour, Voyageur pVoyageur, Hote pHote, boolean pEstValidee, String pDate){
        id = pId;
        sejour = pSejour;
        voyageur = pVoyageur;
        estValidee = pEstValidee;
        dateDeReservation = pDate;
        hote = pHote;
    }

    public void afficher(){
        System.out.println(voyageur.getPrenom() + " " + voyageur.getNom() + " (" + voyageur.getAge() + " ans) " +
                " a fait une reservation chez "  + hote.getNom() + " " + hote.getPrenom() + " " + hote.getAge());
        System.out.println("Qui s engage à répondre dans les " + hote.getDelaiDeReponse() + " heures");
        System.out.println("Le logement est situé : " + sejour.getLogementAdresse());
        System.out.println("Superficie : " + sejour.getLogementSuperficie() + "m2");
        System.out.println("La date d'arrivée est le : " + dateDeReservation + " pour " + sejour.getNbNuits() + " nuits");
        System.out.println("Le prix du séjour est de " + sejour.getNbNuits() * sejour.getLogementTarif() + " euros");
    }


}
