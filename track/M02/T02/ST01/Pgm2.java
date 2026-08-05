
public class Pgm2 {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean backlog = false;
        boolean project = true;

        int mockInterviewScore = 65;
        if (marks >= 60 && attendance >= 75 && !backlog) {
            if (project) {
                if (mockInterviewScore >= 70) {
                    System.out.println("Placement Ready");
                } else {
                    System.out.println("Improve Interview Skills");
                }
            } else {
                System.out.println("complete project");
            }
        } else {
            System.out.println("Improve Acedamic Eligibility");
        }
    }
}
