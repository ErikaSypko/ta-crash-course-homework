package eleventhTask;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 6)
            this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudentsCourse(List<Student> students, Integer course) {
        Iterator<Student> iter = students.iterator();
        System.out.println("Course " + course);
        while (iter.hasNext()) {
            Student i = iter.next();
            if (i.course == course)
                System.out.println("Name: " + i.name);
        }
    }

    public static void printStudents(List<Student> students) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student i = iter.next();
            System.out.println("Name: " + i.name + " Course: " + i.course);
        }
    }


}

