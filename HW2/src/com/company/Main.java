package com.company;

import java.util.Scanner;

public class Main {
    static void firstTask(double a, double b, double c, double x, double y) {

        if (a < 0 || b < 0 || c < 0 || x < 0 || y < 0) {
            System.out.println("Число має бути невід'ємним!");
            return;
        }
        if ((a < x && b < y || a < y && b < x)
                || (a < x && c < y || a< y && c < x)
                || (b < x && c < y || b < y && c < x)) {
            System.out.println("Так.");
        }
        else {
            System.out.println("Ні.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Завдання 1:");
        Scanner in = new Scanner(System.in);
        double a ,b,c,x,y;
        System.out.print("Введіть a: ");
        a = in.nextDouble();
        System.out.print("Введіть b: ");
        b = in.nextDouble();
        System.out.print("Введіть c: ");
        c = in.nextDouble();
        System.out.print("Введіть x: ");
        x = in.nextDouble();
        System.out.print("Введіть y: ");
        y = in.nextDouble();
        firstTask(a,b,c,x,y);
        System.out.println();
    }
}
