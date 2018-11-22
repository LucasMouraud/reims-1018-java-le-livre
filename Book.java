public class Book{

    public static void main (String[] args){
    	  var foo = new PageReader();
        BookDisplay.home();
        String name = BookDisplay.askName();
        BookDisplay.displayName(name);
        String go = BookDisplay.askGo();
        BookDisplay.displayGo(go);
        Page page1 = foo.getFirstPage();
        BookDisplay.displayFirstPage(page1);
    }
}
