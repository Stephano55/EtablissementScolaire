abstract class Personnes {
    private String nom;
    private String prenom;
    private String rue;
    private String ville;
    private static int nbPersonnes;

    public Personnes(){
        this.nom = "inconnu";
        this.prenom = "inconnu";
        this.rue = "inconnue";
        this.ville = "inconnue";
        nbPersonnes++;
    }
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
        System.out.println("Le nombre de personnees dans l'etablissement est: "+nbPersonnes+
        "\nNombre de secrétaires : " + Secretaire.nbSecretaire() +
        "\nNombre d’enseignants : " + Enseignant.nbEnseignents() +
        "\nNombre d’étudiants : " + Etudiant.nbEtudiants()
        );
    }
    public void setPersonne(String rue, String ville){
        this.rue = rue;
        this.ville = ville;
        ecrirePersonne();
    }
}
