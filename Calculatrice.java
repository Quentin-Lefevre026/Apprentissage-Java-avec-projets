import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        System.out.println("=== Calculatrice ===");
        System.out.println("additionner / soustraire / multiplier / diviser");
        System.out.print("Choix : ");
        Scanner sc = new Scanner(System.in);
        String choix = sc.nextLine();
        System.out.print("premier nombre : ");
        int a = sc.nextInt();
        System.out.print("deuxieme nombre : ");
        int b = sc.nextInt();
        int resultat = 0;
        if (choix.equals("additionner")) {
            resultat = additionner(a,b);
        }
        else if (choix.equals("soustraire")) {
            resultat = soustraire(a,b);
        }
        else if (choix.equals("multiplier")) {
            resultat = multiplier(a,b);
        }
        else if (choix.equals("diviser")) {
            resultat = diviser(a,b);
        }

        System.out.printf("Résultat : %d%n", resultat);
        sc.close();
    }
    public static int multiplier(int a, int b){
       return a*b;
    }
    public static int additionner(int a, int b){
       return a+b;
    }
    public static int soustraire(int a, int b){
       return a-b;
    }
    public static int diviser(int a, int b){
       return a/b;
    }
}

