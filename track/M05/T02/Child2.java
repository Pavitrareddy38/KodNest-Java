
class Child2 extends Parent2 {

    Child2() {
        this(10);
        System.out.println("inside Child 0-par constructor");
    }

    Child2(int a) {
        this(20, 30);
        System.out.println(a);
        System.out.println("inside Child 1-par constructor");

    }

    Child2(int a, int b) {

        System.out.println(a);
        System.out.println(b);
        System.out.println("inside Child 2-par constructor");

    }
}
