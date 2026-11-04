
public class Main1 {

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        accessMethod(ch1);
        Child2 ch2 = new Child2();
        accessMethod(ch2);
    }

    public static void accessMethod(Parent p) {
        p.display1();
        p.display2();
        if (p instanceof Child1) {
            ((Child1) (p)).display3();
        } else if (p instanceof Child2) {
            ((Child2) (p)).display3();
        }
    }
}
