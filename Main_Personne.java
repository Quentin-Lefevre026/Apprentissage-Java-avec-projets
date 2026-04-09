
public class Main_Personne{

    public static void main(String[] args) {
        Personne p1 = new Personne("Boris", 18, 8);
        Personne p2 = new Personne("Quentin", 19, 1.1);
        p1.sePresenter();
        p2.sePresenter();
        System.out.println("Le nom de p1 est : " + p1.getNom());
    }
}