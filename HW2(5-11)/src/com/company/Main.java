package com.company;

import eighthTask.ContractEmployee;
import eighthTask.Employee;
import eighthTask.SalariedEmployee;
import eleventhTask.CourseComparator;
import eleventhTask.NameComparator;
import eleventhTask.Student;
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

    public static void Task10A(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setU = new HashSet<>(set1);
        Set<Integer> setI = new HashSet<>(set1);
        setU.addAll(set2);
        setI.retainAll(set2);
        System.out.println("Union:");
        for (var u : setU) {
            System.out.print(u + " ");
        }
        System.out.println("\n\nIntersect:");
        for (var i : setI) {
            System.out.print(i + " ");
        }
    }

    public static void Task10BIsNamesNonUnique(Map<String, String> personMap) {
        ArrayList<String> names = new ArrayList<>(personMap.values());
        Collections.sort(names);
        Integer count = 1;
        String tname = names.get(0);

        for (int i = 1; i < names.size(); i++) {
            if (tname == names.get(i)) {
                count++;
                if (count >= 2) {
                    System.out.println("YES " + names.get(i));
                    return;
                }

            } else {
                tname = names.get(i);
                count = 1;
            }
        }
//        Map<String, Integer> d = new HashMap<String, Integer>();
//        for (var p : personMap.keySet()) {
//            if (d.containsKey(personMap.get(p))) {
//                d.put(personMap.get(p), d.get(personMap.get(p)) + 1);
//            } else {
//                d.put(personMap.get(p), 1);
//            }
//        }

    }

    public static Map<String, String> Task10BRemoveName(Map<String, String> personMap, String name) {
        personMap.values().removeAll(Collections.singleton((name)));
        return personMap;
    }

    public static void Task10BPrint(Map<String, String> personMap) {
        for (var p : personMap.entrySet()) {
            System.out.printf("Key: %s  Value: %s \n", p.getKey(), p.getValue());
        }
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

        System.out.println("\nTask 10a:");
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 4, 5, 8));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 8, 19, 22));
        Task10A(set1, set2);
        System.out.println("\n\nTask 10b:");
        Map<String, String> personMap = new HashMap<>() {{
            put("Woodward", "Amy");
            put("Grainger", "Angelina");
            put("John", "Elton");
            put("Montes", "Alejandro");
            put("Ponds", "Amy");
            put("Smith", "Matt");
            put("Williams", "Rory");
            put("Pond", "Melody");
            put("Germanotta", "Angelina");
            put("Tennant", "David");
        }};
        System.out.println("All people:");
        Task10BPrint(personMap);
        System.out.print("\nThere are at less two persons with the same first name ? ");
        Task10BIsNamesNonUnique(personMap);
        String name = "Angelina";
        System.out.printf("\nWithout %s: \n", name);
        Map<String, String> temp = Task10BRemoveName(personMap, name);
        Task10BPrint(temp);

        System.out.println("\nTask 11:");
        List<Student> students = Arrays.asList(new Student("Vera", 2),
                new Student("Joanne", 5),
                new Student("Angelina", 4),
                new Student("Matt", 1),
                new Student("Amelia", 5),
                new Student("River", 2),
                new Student("Regina", 1)
        );
        Student.printStudentsCourse(students, 5);
        Collections.sort(students, new CourseComparator());
        System.out.println("\nSorted by course:");
        Student.printStudents(students);
        System.out.println("\nSorted by name:");
        Collections.sort(students, new NameComparator());
        Student.printStudents(students);
    }
}

