
import java.util.*;

public class StudentApp {

    public static void main(String[] args) {
        Student s1 = new Student(11, "ANU");
        Student s2 = new Student(12, "ARUN");
        Student s3 = new Student(11, "ANU");
        System.out.println("set:");
        HashSet hs = new HashSet();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
