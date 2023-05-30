package HomeWork4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {
    private static int randomizer(int bord) {
        Random randomInt = new Random();
        return randomInt.nextInt(bord + 1);
    }

    private static List<Integer> createList(int size, int border) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(randomizer(border));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> newList = createList(10, 100);
        System.out.println("Исходный список:");
        System.out.println(newList);
        Collections.reverse(newList);
        System.out.println("Перевернутый список:");
        System.out.println(newList);
    }
}
