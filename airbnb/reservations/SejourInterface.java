package matthieu.airbnb.reservations;

public interface SejourInterface {

    public default boolean verificationDateArrive(){
        return false;
    }

    public default boolean verificationNbNuits(){
        return false;
    }
    public default boolean verificationNbVoyageurs(){
        return false;
    }

    public default void afficher(){

    }




}
