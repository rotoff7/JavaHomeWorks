package ClassWork2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту
//строку в простой текстовый файл, обработайте исключения.
public class Task22 {
    private static Logger logger = Log.log(Task22.class.getName());
    public void write(String string){
        String str = createStr(string);
        logger.log(Level.INFO, "Длина повторяемой строки = " + str.length());
        try(FileWriter in = new FileWriter("test.txt");) {
            in.write(str);
            logger.log(Level.INFO,"Записано");
//            divide(2, 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private String createStr(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(str);
        }
//        builder.append(String.valueOf(str).repeat(100));
        return builder.toString();
    }
    private double divide(int a, int b){
        if (b == 0) throw new DivideByZero("На ноль делить нельзя");
        return a / b;
    }
}
