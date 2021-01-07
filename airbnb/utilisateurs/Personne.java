package matthieu.airbnb.utilisateurs;

public class Personne {

    /**
     * Ma classe Personne
     */
    public static String nom;
    private String prenom;
    private int age;

    /**
     *
     * @param paramNom - Le nom
     * @param paramPrenom - Le prénom
     * @param paramAge - L'âge
     */
    public Personne(String paramNom, String paramPrenom, int paramAge) {
        nom = paramNom;
        prenom = paramPrenom;
        age = paramAge;
    }


    /**
     * Affiche la <b>personne</b>
     */
    public void afficher(){
        System.out.println(nom + " " + prenom + " (" + age + " ans)");
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public int getAge(){
        return age;
    }


}
