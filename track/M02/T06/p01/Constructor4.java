
import java.util.Scanner;

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }
}

public class Constructor4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter booktitle,author");
        Book b = new Book(sc.nextLine(), sc.nextLine());
        b.display();
        sc.close();

    }
}
