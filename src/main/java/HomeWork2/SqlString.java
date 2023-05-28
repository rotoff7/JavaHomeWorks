package HomeWork2;
//1) Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class SqlString {
    public String fromJsonStr(String jStr){
        Object obj = null;
        try {
            obj = new JSONParser().parse(jStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject jo = (JSONObject) obj;
// Достаём данные
        String name = (String) jo.get("name");
        String country = (String) jo.get("country");
        String city = (String) jo.get("city");
        return String.format("name = \"%s\" AND country = \"%s\" AND city = \"%s\"", name, country, city);
    }
}
