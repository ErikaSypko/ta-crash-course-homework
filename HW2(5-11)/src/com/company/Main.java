package com.company;

import eighthTask.ContractEmployee;
import eighthTask.Employee;
import eighthTask.SalariedEmployee;
import seventhTask.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

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
            employeeList.add(new SalariedEmployee("456-22-1920", "Angelina", 15,7));
            employeeList.add(new ContractEmployee("SE883", "Martha", 1899));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Collections.sort(employeeList, Collections.reverseOrder());
        for (var e : employeeList) {
            System.out.println(e.toString());
        }
    }
}
