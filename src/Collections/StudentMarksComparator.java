package Collections;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // o1, o2
        // Decreasing -> if o1.marks bigger than o2.marks -> Do I need to swap? No i.e. need to return -ve integer
        return o2.getMarks() - o1.getMarks();
    }
}
