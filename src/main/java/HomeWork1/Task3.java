package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = input.nextDouble();
        System.out.print("Введите знак действия: ");
        String sign = input.next();
        if (!signCheck(sign)){
            System.exit(-1);
        }
        System.out.print("Введите второе число: ");
        double b = input.nextDouble();
        double result = calculations(a, b, sign);
        System.out.println(a + sign + b + "=" + result);
    }

    public double calculations(double a, double b, String sign) {
        if (sign.equals("+")){
            return a + b;
        }
        if (sign.equals("-")){
            return a - b;
        }
        if (sign.equals("/")){
            return a / b;
        }
        return a * b;
    }
    public boolean signCheck(String sign){
        if (sign.equals("+")){
            return true;
        }
        if (sign.equals("-")){
            return true;
        }
        if (sign.equals("/")){
            return true;
        }
        if (sign.equals("*")){
            return true;
        }
        return false;
    }
}
