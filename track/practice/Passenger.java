
public class Passenger {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money();
        Ticket t = c.give();
        c.collect(m);
        if (t != null) {
            System.out.println("Ticket collected by passenger");
        }
    }
}
