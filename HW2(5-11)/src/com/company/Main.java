package com.company;

import eighthTask.ContractEmployee;
import eighthTask.Employee;
import eighthTask.SalariedEmployee;
import seventhTask.*;
import java.util.*;

public class Main {

    public static double Div(double a, double b) throws Exception {
        if (b == 0) throw new Exception("Сannot be divided by zero!");
        return a / b;
    }

    public static double readNumber(double start, double end) throws Exception {
        System.out.printf("Input number in range (%d,%d): ", (int) start, (int) end);
        System.out.println();
        Scanner in = new Scanner(System.in);
        Double inputNum;
        try {
            inputNum = in.nextDouble();
        } catch (InputMismatchException e) {
            throw new Exception("Non-number text");
        }
        if (inputNum <= start || inputNum >= end)
            throw new Exception("Invalid range");


        return inputNum;
    }

    public static void Task9(int n, double start, double end) throws Exception {
        double temp = readNumber(start, end);
        int count = 1;
        while (n > 1) {
            System.out.println(count + ") " + temp);
            temp = readNumber(temp, end);
            n = n - 1;
            count++;
        }
        System.out.println(count + ") " + temp);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Task 7:");
        Bird[] birds = {new Chicken(true),
                new Eagle(true),
                new Swallow(false),
                new Chicken(true),
                new Swallow(true),
                new Penguin(true)};
        int i = 1;
        for (var b : birds) {
            System.out.print(i + ". ");
            b.info();
            i++;
        }

        System.out.println("\nTask 8:");
        List<Employee> employeeList = new ArrayList<Employee>();
        try {
            employeeList.add(new SalariedEmployee("078-05-1120", "Stefany", 10, 8));
            employeeList.add(new ContractEmployee("SE883", "Sophia", 2899));
            employeeList.add(new ContractEmployee("QC854", "John", 5000));
            employeeList.add(new ContractEmployee("AR156", "Joanne", 3800));
            employeeList.add(new SalariedEmployee("456-22-1920", "Angelina", 15, 7));
            employeeList.add(new ContractEmployee("SE883", "Martha", 1899));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Collections.sort(employeeList, Collections.reverseOrder());
        for (var e : employeeList) {
            System.out.println(e.toString());
        }

        System.out.println("\nTask 9:");
        try {
            System.out.println("div: " + Div(12.5, 3));
            Task9(10, 1, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
