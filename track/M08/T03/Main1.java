
import java.util.TreeSet;

public class Main1 {

    public static void main(String[] args) {
        TreeSet al = new TreeSet();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);

        System.out.println(al);
        System.out.println(al.headSet(75));
        System.out.println(al.headSet(75, true));
        System.out.println(al.tailSet(100));
        System.out.println(al.tailSet(100, false));
        System.out.println(al.higher(75));
        System.out.println(al.higher(80));
        System.out.println(al.higher(100));
        System.out.println(al.higher(200));
        System.out.println(al.lower(75));
        System.out.println(al.lower(80));
        System.out.println(al.lower(20));
        System.out.println(al.ceiling(75));
        System.out.println(al.ceiling(80));
        System.out.println(al.ceiling(200));
        System.out.println(al.floor(75));
        System.out.println(al.floor(60));
        System.out.println(al.floor(20));

    }
}
