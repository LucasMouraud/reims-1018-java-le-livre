public class Book{

    public static void main (String[] args){
        PageReader.readJson();
        BookDisplay.home();
        String name = BookDisplay.askName();
        BookDisplay.displayName(name);
    }
}
