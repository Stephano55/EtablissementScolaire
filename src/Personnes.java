abstract class Personnes {
    private String nom;
    private String prenom;
    private String rue;
    private String ville;
    private static int nbPersonnes = 0;

    public Personnes(String nom, String prenom, String rue, String ville){
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes++;
    }

    public String toString(){
        return nom+"  "+prenom+"  "+rue+"  "+ville+"  ";
    }
    abstract void ecrirePersonne();
    public static void nbPersonnes(){
        System.out.println("Le nombre de personnees dans l'etablissement est: "+nbPersonnes);
    }
    public void setPersonne(String rue, String ville){
        this.rue = rue;
        this.ville = ville;
        ecrirePersonne();
    }
}
