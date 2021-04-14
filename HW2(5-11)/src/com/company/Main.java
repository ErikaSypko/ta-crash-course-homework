package com.company;
import seventhTask.*;

public class Main {

    public static void main(String[] args) {
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
    }
}
