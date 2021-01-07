package matthieu.airbnb.reservations;

import java.util.Date;

public interface SejourInterface {

    public default boolean verificationDateArrive(Date pDateArrivee, Date pDateNow){
        if (pDateArrivee.compareTo(pDateNow) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public default boolean verificationNbNuits(int pNbNuits){
        int min = 1;
        int max = 31;

        if (pNbNuits > min && pNbNuits < max ){
            return true;
        } else {
            return false;
        }
    }
    public default boolean verificationNbVoyageurs(int pNbVoyageursMax, int nbVoyageurs){
        if (pNbVoyageursMax > nbVoyageurs){
            return false;
        } else {
            return true;
        }
    }

    public default void afficher(){

    }


}
