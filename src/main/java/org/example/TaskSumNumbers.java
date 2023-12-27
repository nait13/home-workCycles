package org.example;

import java.util.Scanner;

public class TaskSumNumbers {
    public static void main(String[] args) {
        System.out.println("Введите любое положителное число ");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            if (number <= 0) {
                System.out.println("Введите положительное число!!! ");
            } else {
                for (int i = 0; i <= number; i++) {
                    sum += i;
                }
                System.out.println("Сумма чисел от 0 до " + number + " равно: " + sum);
            }

        } else {
            System.out.println("Не коректно введённое число!");
        }
        scan.close();
    }
}