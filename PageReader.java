import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PageReader{
    public static void readJson(){
        FileReader jsonFile = null;
        try {
            // lecture du fichier json
            jsonFile = new FileReader("Livre.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JSONParser parser = new JSONParser();
        Object jsonParsed = null;
        try{
            jsonParsed = parser.parse(jsonFile);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        JSONArray root = (JSONArray) jsonParsed;
    }

    public static void readPage(){

        String content = (String) root.get ("content");
    }
}