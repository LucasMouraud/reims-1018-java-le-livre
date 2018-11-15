import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PageReader{
    private final static String JSON_BOOK_PATH = "Livre.json";
    public static void readJson(){
        FileReader jsonFile = null;
        try {
            jsonFile = new FileReader(JSON_BOOK_PATH);
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
        JSONObject page = (JSONObject) root.get(0);
        int id = Math.toIntExact((long) page.get("id"));
        String content = (String) page.get("content");

        Page pageUne = new Page(id, content);
    }
}