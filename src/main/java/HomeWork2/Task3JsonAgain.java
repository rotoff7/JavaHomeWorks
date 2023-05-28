package HomeWork2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Task3JsonAgain {
    public void fromJsonStr() throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\User\\Desktop\\cl\\JavaHomeWork\\ProjectForHW\\src\\main\\java\\HomeWork2\\jsonStr.json"));
        JSONArray array = (JSONArray) obj;
        for (Object o : array) {
            JSONObject jsonObject = (JSONObject) o;
            String builder = "Студент " + jsonObject.get("фамилия") +
                    " получил(а) оценку " +
                    jsonObject.get("оценка") +
                    " по предмету " +
                    jsonObject.get("предмет");
            System.out.println(builder);
        }
    }
}
