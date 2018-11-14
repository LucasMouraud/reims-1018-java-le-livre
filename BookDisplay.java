import java.util.Scanner;

public class BookDisplay{

	static Scanner sc = new Scanner(System.in);

    public static void home(){
        System.out.println("Bienvenue sur le livre dont vous êtes le sorcier/la sorcière");
    }

    public static String askName(){      
        System.out.println("Veuillez saisir votre pseudo : ");
        String name  = sc.nextLine();
        return "Genial " + name + ", entre 'go' pour commencer";
    }
}
