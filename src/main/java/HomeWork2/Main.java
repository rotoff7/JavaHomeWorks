package HomeWork2;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SqlString task1 = new SqlString();
        String startedStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String result = task1.fromJsonStr(startedStr);
        System.out.println("select * from students where " + result);
    }
}
