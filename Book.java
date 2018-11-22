public class Book{

    public static void main (String[] args){
        BookDisplay.home();
        String name = BookDisplay.askName();
        BookDisplay.displayName(name);
        String go = BookDisplay.askGo();
        BookDisplay.displayGo(go);
    }
}
