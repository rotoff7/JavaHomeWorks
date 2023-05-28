package HomeWork2;

import java.io.FileInputStream;
import java.util.logging.LogManager;

public class Logs {
    static {
        try (FileInputStream in = new FileInputStream("log.config")) { //полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static java.util.logging.Logger log(String className) {
        return java.util.logging.Logger.getLogger(className);
    }
}
