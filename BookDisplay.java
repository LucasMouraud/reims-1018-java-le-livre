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
        if(go.equals("go") || go.equals("Go")){
            System.out.println("bien joué, tu sais écrire 'go'");
            //System.out.println(PageReader.pages[0].getContent());
        }
        else {
            System.out.println("Vous n'avez pas rentré 'go'");
        }
    }
}
