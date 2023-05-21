package HomeWork1;

//2) Вывести все простые числа от 1 до 1000
public class Task2 {
    public void primeNumber() {
//        1 и 1000 можно не проверять
        short printCount = 1;
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            int j = 2;
            while ((j <= i / 2) && (flag)) {
                if (i % j == 0) {
                    flag = false;
                }
                j += 1;
            }
            if (flag) {
                if (printCount % 10 != 0){
                    System.out.print(i + " ");
                } else {
                    System.out.println(i);
                }
                printCount += 1;
            }
        }
    }
}


//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }