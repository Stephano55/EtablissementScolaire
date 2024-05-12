import java.security.spec.ECFieldF2m;

public class Etudiant extends Personnes {
    private String diplomeEnCours;
    private static int nbEtudiants;

    public Etudiant(String nom, String prenom, String rue, String ville, String diplEnC){
        super(nom, prenom, rue, ville);
        this.diplomeEnCours = diplEnC;
        nbEtudiants++;
    }

    public String toString(){
        return super.toString()+"\nDiplôme en cours: "+diplomeEnCours;
    }
    public void ecrirePersonne(){
        System.out.println("Etudiant :\n"+toString());
    }
    static int nbEtudiants(){
        return nbEtudiants;
    }
}
