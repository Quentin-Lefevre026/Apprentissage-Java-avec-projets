public class Personne {
    private String nom;
    private int age;
    private double taille;

    public Personne(String nom, int age, double taille) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
    }

    public void sePresenter() {
        System.out.println("Je m'appelle " + nom + " j'ai " + age + " ans et je fais " + taille + "m");
    }

    // getters
    public String getNom() { return nom; }
    public int getAge() { return age; }
    public double getTaille() { return taille; }

    // setters
    public void setNom(String nom) { this.nom = nom; }
    public void setAge(int age) { this.age = age; }
    public void setTaille(double taille) { this.taille = taille; }
}