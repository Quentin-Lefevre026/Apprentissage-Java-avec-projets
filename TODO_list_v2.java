import java.util.ArrayList;
import java.util.Scanner;

public class TODO_list_v2{

    public static void main(String[] arg){
        Scanner sca = new Scanner(System.in);
        ArrayList<Tache> taches = new ArrayList<>();
        System.out.println("==== TODO list ====");
        System.out.println("Tapez : ");
        System.out.println("1 pour ajouter une tache");
        System.out.println("2 pour cocher/decocher une tache");
        System.out.println("3 pour afficher votre liste");
        System.out.println("4 pour quitter votre liste");
        while(true){
            System.out.print("Choix : ");
            int choix = sca.nextInt();

            if ( choix == 1 ){
                System.out.print("Saisir la tache : ");
                sca.nextLine();
                String description = sca.nextLine();
                taches.add(new Tache(description, false));
            }
            else if ( choix == 2){
                for (int i = 0; i <taches.size(); i++){
                    System.out.print((i+1)+".");
                    taches.get(i).afficher();
                }
                System.out.print("Quel tache cocher ( numero ) ?");
                int numero = sca.nextInt();
                taches.get(numero-1).cocher();
            }
            else if ( choix == 3){
                for (Tache t : taches ){
                    t.afficher();
                }
            }
            else if (choix == 4){
                break;
            }
        
        }
        sca.close();
    }
}