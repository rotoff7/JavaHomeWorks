package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Создание списка.
        List<Integer> list = new ArrayList<Integer>();
        Random randomInt = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            list.add(randomInt.nextInt(101));
        }
        System.out.println(list);

// удаление четных чисел и сразу подсчет суммы(если нужно)
        int elementsSum = 0;
        for (int i = 0; i < list.size(); i++) {
// elementsSum += list.get(i);
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

// найти минимальное, максимально и среднее значение + подсчет суммы(если отдельно)
        Collections.sort(list);
        System.out.println("После сортировки: " + list);
        int maxValue = list.get(list.size() - 1);
        int minValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            elementsSum += list.get(i);
        }
        int averageValue = elementsSum / list.size();

        System.out.println("Максимальное значение списка = " + maxValue);
        System.out.println("Минимальное значение списка = " + minValue);
        System.out.println("Сумма всех числе в списке = " + elementsSum);
        System.out.println("Среднее значение в списке = " + averageValue);
    }
}