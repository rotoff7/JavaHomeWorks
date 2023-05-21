package org.example;

import HomeWork1.Task1;
import HomeWork1.Task2;
import HomeWork1.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1 (часть 1).");
        Task1 task1 = new Task1();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userNum = input.nextInt();
        int part1 = task1.triangularNum(userNum);
        System.out.println(part1 + " - треугольное число для числа " + userNum);

        System.out.println("\nЗадание №1 (часть 2).");
        System.out.print("Введите число: ");
        int userNum2 = input.nextInt();
        int part2 = task1.factorial(userNum2);
        System.out.println(part2 + " - факториал числа " + userNum2);

        System.out.println("\nЗадание №2.\nВывод всех ПРОСТЫХ чисел от 1 до 1000: ");
        Task2 task2 = new Task2();
        task2.primeNumber();

        System.out.println("\nЗадание №3.\nКалькулятор.");
        Task3 calculator = new Task3();
        calculator.calculate();

    }
}