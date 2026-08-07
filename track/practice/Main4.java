
public class Main4 {

    public static void main(String[] args) {
        int practiceDays = 5;
        int revisionDay = 3;
        int sessionHours = 2;
        int finalDayLimit = 1;
        int trgetSessions = 7;
        int completedSessions = 0;
        outer:
        for (int i = 1; i <= practiceDays; i++) {
            inner:
            for (int j = 1; j <= sessionHours; j++) {
                if (i == 3) {
                    continue outer;
                }
                if (i == 5 && j == 2) {
                    break inner;
                }
                System.out.println("Day " + i + " - " + " Sessions " + j);

                completedSessions += 1;
            }
        }
        System.out.println("Completed Sessions: " + completedSessions);
        if (completedSessions == 7) {
            System.out.println("Target Achieved");
        } else {
            System.out.println("Target Pending");
        }

    }
}
