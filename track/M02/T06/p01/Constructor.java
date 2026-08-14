
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "anu";
        age = 20;
        height = 5.5;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

}

class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rani", 21, 5.8);
        s1.display();
        s2.display();
        Student s3 = new Student("Manu");
        s3.display();
    }
}
