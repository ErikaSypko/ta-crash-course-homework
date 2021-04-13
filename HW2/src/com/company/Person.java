package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    private String name;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    private void setMonthOfBirth(int yearOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    private void setDayOfBirth(int yearOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    Person() {
        name = "Undefined";
        yearOfBirth = 1990;
        monthOfBirth = 01;
        dayOfBirth = 01;
    }

    Person(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    private int CalculateAge() {
        LocalDate l = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(l, now);
        return diff.getYears();
    }

    public void Input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        this.name = in.nextLine();
        System.out.print("Input year of birth: ");
        this.yearOfBirth = in.nextInt();
        System.out.print("Input month of birth: ");
        this.monthOfBirth = in.nextInt();
        System.out.print("Input day of birth: ");
        this.dayOfBirth = in.nextInt();
    }

    public void Output(){
        System.out.printf("Name: %s  Age: %d\n", name, CalculateAge());
    }

    public void ChangeName(String name){
        setName(name);
    }

}
