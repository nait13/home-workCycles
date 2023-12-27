package org.example;

import java.util.Scanner;

public class TaskEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0){
            System.out.println("Чётное!");
        } else {
            System.out.println("Не чётное!");
        }
        scan.close();
    }
}
