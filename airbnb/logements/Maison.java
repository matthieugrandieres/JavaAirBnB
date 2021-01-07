package matthieu.airbnb.logements;

import matthieu.airbnb.utilisateurs.Hote;

public class Maison extends Logement{

    private int superficieJardin;
    private boolean possedePiscine;


    public Maison(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax,
                  int paramSuperficieJardin, boolean paramPossedePiscine) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        superficieJardin = paramSuperficieJardin;
        possedePiscine = paramPossedePiscine;
    }
}
