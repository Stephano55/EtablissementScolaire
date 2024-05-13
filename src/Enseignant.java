public class Enseignant extends Personnes{
    private String specialite;
    private static int nbEnseignents;

    public Enseignant(String nom, String prenom, String rue, String ville, String specialite){
        super(nom, prenom, rue, ville);
        this.specialite = specialite;
        nbEnseignents++;
    }

    public String toString(){
        return super.toString()+"\nSpecilité: "+specialite;
    }
    public void ecrirePersonne(){
        System.out.println("\nEnseignat: "+toString());
    }
    public static int nbEnseignents(){
        return nbEnseignents;
    }
}
