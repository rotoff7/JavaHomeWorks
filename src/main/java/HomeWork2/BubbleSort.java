package HomeWork2;

import ClassWork2.Log;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort {
    private static final Logger logger = Log.log(BubbleSort.class.getName());

    public int[] createArray(int size) {
        int[] randomArray = new int[size];
        Random randomNum = new Random();
        size = 10;
        for (int i = 0; i < size; i++) {
            randomArray[i] = randomNum.nextInt(101);
        }
        logger.log(Level.INFO, "Длина созданного массива = " + size);
        return randomArray;
    }

    public void sortArray(int[] array) {
        logger.log(Level.INFO,"Массив " + Arrays.toString(array) + " передан к сортировке.");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            logger.log(Level.INFO, "Промежуточный результат сортировки: " + Arrays.toString(array));
        }
        logger.log(Level.INFO,"Массив остортирован.");
    }

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
