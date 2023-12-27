package org.example;

import java.util.Scanner;

public class TaskTemperature {
    public static void main(String[] args) {
        System.out.println("Введите температуру на улице: ");
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp > -20 && temp <= -5) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold!!!");
        }
        scan.close();
    }
}
