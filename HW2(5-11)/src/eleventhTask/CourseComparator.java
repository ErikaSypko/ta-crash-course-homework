package eleventhTask;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return ((Integer) o1.getCourse()).compareTo(o2.getCourse());
    }
}
