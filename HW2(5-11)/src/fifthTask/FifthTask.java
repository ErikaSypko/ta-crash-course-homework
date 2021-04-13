package fifthTask;

import java.util.*;

enum HTTPError {
    ERROR400("Bad Request"),
    ERROR401("Unauthorized"),
    ERROR402("Payment Required"),
    ERROR403("Forbidden"),
    ERROR404("Not Found");

    private String description;

    HTTPError(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class FifthTask {
    public static void FirstA(int n, int m) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first num: ");
        float num1 = in.nextFloat();
        System.out.print("Input second num: ");
        float num2 = in.nextFloat();
        System.out.print("Input third num: ");
        float num3 = in.nextFloat();
        float[] arr = {num1, num2, num3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n && arr[i] <= m) {
                count++;
            }
        }
        if (count == arr.length) {
            System.out.printf("All numbers belong to the range (%d,%d)", n, m);
        } else {
            System.out.printf("Not all numbers belong to the range (%d,%d)", n, m);

        }
    }

    public static void FirstB() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first num: ");
        int num1 = in.nextInt();
        System.out.print("Input second num: ");
        int num2 = in.nextInt();
        System.out.print("Input third num: ");
        int num3 = in.nextInt();
        int[] arr = {num1, num2, num3};
        Arrays.sort(arr);
        System.out.printf("Min elem: %d Max elem: %d", arr[0], arr[arr.length - 1]);
    }

    public static void FirstC() {
        HTTPError[] arr = {HTTPError.ERROR400, HTTPError.ERROR401, HTTPError.ERROR402, HTTPError.ERROR403, HTTPError.ERROR404};
        for (HTTPError e : arr) {
            System.out.println(e + " - " + e.getDescription());
        }
    }

    public static List<Dog> FindOldestDog(List<Dog> dogs) {
        int ageDog = Integer.MIN_VALUE;
        List<Dog> oldestDogs = new ArrayList<>();
        for (Dog d : dogs) {
            if (d.getAge() > ageDog) {
                ageDog = d.getAge();
            }
        }
        for (Dog d : dogs) {
            if (d.getAge() == ageDog) {
                oldestDogs.add(d);
            }
        }
        return oldestDogs;
    }

    public static void DogsWithTheSameName(List<Dog> dogs) {
        HashMap<String, Integer> d = new HashMap<String, Integer>();
        for (var dog : dogs) {
            if (d.containsKey(dog.getName())) {
                System.out.println("YES " + dog.getName());
                break;
            } else {
                d.put(dog.getName(), 1);
            }
        }
    }


    public static void main(String[] args) {
        FirstA(-5, 5);
        System.out.println();
        FirstB();
        System.out.println();
        FirstC();

        System.out.println();
        System.out.println("Task 2:");
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bailey", Breed.Afador, 10));
        dogs.add(new Dog("Lucy", Breed.Boerboel, 15));
        dogs.add(new Dog("Charlie", Breed.Cavapoo, 15));
        dogs.add(new Dog("Luna", Breed.AustralianKelpie, 2));
        dogs.add(new Dog("Lucy", Breed.Boerboel, 15));


        System.out.println("All dogs:");
        for (var d : dogs) {
            d.Output();
        }
        System.out.println("Oldest dogs:");

        List<Dog> oldestDogs = FindOldestDog(dogs);

        for (var d : oldestDogs) {
            d.Output();
        }

        DogsWithTheSameName(dogs);


    }
}
