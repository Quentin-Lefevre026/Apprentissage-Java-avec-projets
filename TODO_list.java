import java.util.ArrayList;
import java.util.Scanner;

public class TODO_list{
    public static void main(String[] arg) {
        System.out.println("====TODO List====");
        System.out.println("Tapez : 1 = Ajouter une tache, 2 = Afficher les taches, 3 = Quitter");
        ArrayList<String> taches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Choix : ");
            int choix = sc.nextInt();
            if (choix == 1){
                System.out.print("Entrez une nouvelle tache : ");
                String retour = sc.nextLine();
                String tache = sc.nextLine();
                taches.add(tache);
            }
            if (choix == 2){
                System.out.println("Voici votre TODO List : ");
                for (String tache : taches) {
                    System.out.println(tache);
                }
            }
            if (choix == 3){
                System.out.println("Vous quittez votre liste");
                break;
            }
            
        }   
        sc.close();
    }
}