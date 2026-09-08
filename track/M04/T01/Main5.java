

public class Main5 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        if (s1 == s2) {
            System.out.println("Reference are same");
        } else {
            System.out.println("Reference are not same");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }

    }
}
