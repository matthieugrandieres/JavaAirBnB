package matthieu.airbnb.utilisateurs;


public class Hote extends Personne{

    private int delaiDeReponse;
    public Hote(String paramNom, String paramPrenom, int paramAge, int paramDelaiDeReponse){
        super(paramNom, paramPrenom, paramAge);
        delaiDeReponse = paramDelaiDeReponse;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.print(" qui s'engage à répondre dans les " + delaiDeReponse + " heures");
        System.out.println(" ");

    }
}
