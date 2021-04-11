package com.company;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    static void firstTask(double a, double b, double c, double x, double y) {
        System.out.println("Will the brick pass through?");
        if (a < 0 || b < 0 || c < 0 || x < 0 || y < 0) {
            System.out.println("The number must be non-negative!");
            return;
        }
        if ((a < x && b < y || a < y && b < x)
                || (a < x && c < y || a < y && c < x)
                || (b < x && c < y || b < y && c < x)) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }
    }

    static void secondTaskA(int n) {
        String strN = String.valueOf(n * n);
        if (strN.contains("3")) {
            System.out.print("a.    Number contains 3");
        } else {
            System.out.printf("a.    Number %d does not contains 3", Integer.parseInt(strN));
        }
    }

    static void secondTaskB(int n) {
        int lastNum;
        String rev = "";
        while (n > 0) {
            lastNum = n % 10;
            rev = rev + lastNum;
            n = n / 10;
        }
        System.out.println("\nb.    Reversed num: " + rev);
    }

    static void secondTaskC(int n) {
        String strN = String.valueOf(n);
        char[] arr = strN.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        strN = new String(arr);
        System.out.printf("c.    Swap the first and last digit of %d: " + strN, n);
    }

    static void secondTaskD(int n) {
        String strN = String.valueOf(n);
        strN = "1" + strN + "1";
        System.out.printf("\nd.    Adding the one to the beginning and end of the number: " + strN);
        System.out.println();
    }

    static void thirdTaskA(int r) {
        System.out.printf("a.    p = %f, S = %f", 2 * Math.PI * r, Math.PI * r * r);
    }

    static void thirdTaskB() {
        System.out.print("\nb.    What is your name? ");
        in.nextLine();
        String name = in.nextLine();
        System.out.printf("\nWhere are you live, %s? ", name);
        String address = in.nextLine();
        System.out.printf("Name: %s  Address: %s", name, address);
    }

    static void thirdTaskC() {
        System.out.println("\nc.    Input c1, c2, c3:");
        double c1 = in.nextDouble();
        double c2 = in.nextDouble();
        double c3 = in.nextDouble();
        System.out.println("Input t1, t2, t3:");
        double t1 = in.nextDouble();
        double t2 = in.nextDouble();
        double t3 = in.nextDouble();
        double res1 = c1 * t1;
        double res2 = c2 * t2;
        double res3 = c3 * t3;
        double res = res1 + res2 + res3;
        System.out.printf("Country 1: %f\nCountry 1: %f\nCountry 1: %f\nAll countries: %f", res1, res2, res3, res);
    }

    public static void main(String[] args) {
        System.out.println("Task 1:");
        double a, b, c, x, y;
        System.out.print("Input a: ");
        a = in.nextDouble();
        System.out.print("Input b: ");
        b = in.nextDouble();
        System.out.print("Input c: ");
        c = in.nextDouble();
        System.out.print("Input x: ");
        x = in.nextDouble();
        System.out.print("Input y: ");
        y = in.nextDouble();
        firstTask(a, b, c, x, y);
        System.out.println();

        System.out.println("Task 2:");
        int n;
        System.out.print("Input n: ");
        n = in.nextInt();
        secondTaskA(n);
        secondTaskB(n);
        secondTaskC(n);
        secondTaskD(n);

        System.out.println("\nTask 3:");
        System.out.print("Input r: ");
        int r = in.nextInt();
        thirdTaskA(r);
        thirdTaskB();
        thirdTaskC();




    }
}
