package fifthTask;

import java.util.ArrayList;
import java.util.List;

enum Breed {
    Afador,
    AmericanBulldog,
    AustralianKelpie,
    Boerboel,
    Cavapoo
}

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public void Output() {
        System.out.println("Name: " + name + " breed: " + breed + " age: " + age);
    }
}
