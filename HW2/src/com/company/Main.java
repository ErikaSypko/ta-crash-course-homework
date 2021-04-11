package com.company;

import java.util.Scanner;

public class Main {
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
            System.out.println("a.    Number contains 3");
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
        System.out.print("b.    Reversed num: " + rev);
    }

    static void secondTaskC(int n) {
        String strN = String.valueOf(n);
        char[] arr = strN.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        strN = new String(arr);
        System.out.printf("\nc.    Swap the first and last digit of %d: " + strN, n);
    }

    static void secondTaskD(int n) {
        String strN = String.valueOf(n);
        strN = "1" + strN + "1";
        System.out.printf("\nd.    Adding the one to the beginning and end of the number: " + strN);
    }

    public static void main(String[] args) {
        System.out.println("Task 1:");
        Scanner in = new Scanner(System.in);
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


    }
}
