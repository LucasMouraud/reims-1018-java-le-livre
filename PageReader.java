import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Compile : javac -cp .:json-simple-1.1.1.jar Book.java
// Execute : java -cp .:json-simple-1.1.1.jar Book

public class PageReader{

    private final static String JSON_BOOK_PATH = "Livre.json";

    private ArrayList<Page> pages;

    public PageReader() {
        this.pages = new ArrayList<Page>();

        //lire le fichier json
        FileReader jsonFile = null;
        try {
            jsonFile = new FileReader(JSON_BOOK_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //parser le fichier json
        JSONParser parser = new JSONParser();
        Object jsonParsed = null;
        try{
            jsonParsed = parser.parse(jsonFile);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        // récupérer la racine du fichier
        JSONArray root = (JSONArray) jsonParsed;
        // root.size()

        // créer un conteneur pour stocker les données
        JSONObject page_object = (JSONObject) root.get(0);
        int id = Math.toIntExact((long) page_object.get("id"));
        String content = (String) page_object.get("content");

        Page page = new Page(id, content);
        this.pages.add(page);
    }

    public Page getFirstPage(){
        Page page = this.pages.get(0);
        return page;
    }
}
