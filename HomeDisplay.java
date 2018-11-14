import java.util.Scanner;

public class HomeDisplay{

    public static void home(){
        System.out.println("Bienvenue sur le livre dont vous êtes le sorcier/la sorcière");
    }

    public static String askName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre pseudo : ");
        String str  = sc.nextLine();
        return str;
    }
}
