public class Secretaire extends Personnes{
    private String numBureau;
    private static int nbSecretaire;

    public Secretaire(String nom, String prenom, String rue, String ville, String numBureau){
        super(nom, prenom, rue, ville);
        this.numBureau = numBureau;
    }

    public String toString(){
        return super.toString()+" \nNuméro bureau: "+numBureau;
    }
    public void ecrirePersonne(){
        System.out.println("Secrétaire "+toString());
    }
    static int nbSecretaire(){
        return nbSecretaire;
    }
}
