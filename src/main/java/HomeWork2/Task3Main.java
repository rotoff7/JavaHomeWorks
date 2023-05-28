package HomeWork2;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Task3Main {
    public static void main(String[] args) throws IOException, ParseException {
        Task3JsonAgain jsonParse = new Task3JsonAgain();
        jsonParse.fromJsonStr();
    }
}
