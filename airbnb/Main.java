package matthieu.airbnb;
import matthieu.airbnb.logements.Appartement;
import matthieu.airbnb.logements.Logement;
import matthieu.airbnb.outils.Untile;
import matthieu.airbnb.reservations.Reservation;
import matthieu.airbnb.reservations.Sejour;
import matthieu.airbnb.utilisateurs.Personne;
import matthieu.airbnb.utilisateurs.Hote;
import matthieu.airbnb.utilisateurs.Voyageur;
import matthieu.airbnb.outils.MaDate;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) {

        // 5 - Déclaration hôte ou voyageur
        Hote hote1 = new Hote("Grandieres", "Matthieu", 26, 12);
        Hote hote2 = new Hote("Boubou", "Matthieu", 26, 12);
        //System.out.println(Hote.nom);
        Voyageur voyageur1 = new Voyageur("Dupont", "Henry", 65);

        // 1 -
        // Personne personne1 = new Personne("GRANDIERES", "Matthieu", 26);

        // 2 - Logement
        Logement logement1 = new Logement(hote1, 15 , "6 Avenue du General de Gaulle, 37230 Fondettes", 52, 5);
        // 3 - Date
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);

        // 4 - Sejour
        Sejour sejour1 = new Sejour(formatter.format(date), 3, logement1, 4);

        // 5 - Réservation
        Reservation reservation1 = new Reservation(1, sejour1, voyageur1, hote1,true, formatter.format(date));
        reservation1.afficher();

        // 6 - Appartement
        Appartement appt1 = new Appartement(hote1, 6, "6 av du gen de gaulle, 37230 Fondettes",
                56, 5, 0, 0);
        //appt1.afficher();

        // 7 - Date
        Date madate1 = Untile.stringToDate("12/02/1997");
        System.out.println(madate1);
        String madate2 = Untile.dateToString(madate1);
        System.out.println(madate2);

        // 8 - Date héritage
        //MaDate madate3 = new MaDate();
        System.out.println();
        //System.out.println(madate3);

    }
}
