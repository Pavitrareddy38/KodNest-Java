
import java.util.Scanner;

class StudentTicket {

    int ticket;
    int priority;
    int waitingMinutes;
}

public class Main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentTicket s = new StudentTicket();
        System.out.println("Enter Ticket,priority,waitingMinutes");
        s.ticket = sc.nextInt();
        s.priority = sc.nextInt();
        s.waitingMinutes = sc.nextInt();
        StudentTicket s1 = new StudentTicket();
        System.out.println("Enter  second Ticket,priority,waitingMinutes");
        s1.ticket = sc.nextInt();
        s1.priority = sc.nextInt();
        s1.waitingMinutes = sc.nextInt();
        StudentTicket s2 = new StudentTicket();
        System.out.println("Enter third Ticket,priority,waitingMinutes");
        s2.ticket = sc.nextInt();
        s2.priority = sc.nextInt();
        s2.waitingMinutes = sc.nextInt();
        StudentTicket select = s;
        if ((s1.priority > select.priority) || (s1.priority == select.priority && s1.waitingMinutes > select.waitingMinutes) || (s1.waitingMinutes == select.waitingMinutes && s1.ticket < select.ticket)) {
            select = s1;
        }
        if ((s2.priority > select.priority) || (s2.priority == select.priority && s2.waitingMinutes > select.waitingMinutes) || (s2.waitingMinutes == select.waitingMinutes && s1.ticket < select.ticket)) {
            select = s2;
        }

        System.out.println("Selected Ticket= " + select.ticket);
        System.out.println("Selected Priority= " + select.priority);
        System.out.println("Selected waitingMinutes= " + select.waitingMinutes);
    }
}
