import java.util.Scanner;

public class BookDisplay{

	static Scanner sc = new Scanner(System.in);

    public static void home(){
        System.out.println("Bienvenue sur le livre dont vous êtes le sorcier/la sorcière");
    }

    public static String askName(){
        System.out.println("Veuillez saisir votre pseudo : ");
        String name  = sc.nextLine();
        return name;
    }

    public static void displayName(String name){
        System.out.println("Genial " + name);
    }

    public static String askGo(){
        System.out.println("Entre 'go' pour commencer");
        String go = sc.nextLine();
        return go;
    }

    public static void displayGo(String go){
        while(!go.toLowerCase().equals("go")){
            System.out.println("Vous n'avez pas rentré 'go' mais " + go);
            go = askGo();
        }
    }

    public static void displayFirstPage(Page page){
        System.out.println(page.getContent());
        System.out.println(page.getNextPages());
		}
}
