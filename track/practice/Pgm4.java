
public class Pgm4 {

    public static void main(String[] args) {
        int solvedProblems = 47;
        int numberOfDays = 5;
        double percentage = 86.75;
        double value = solvedProblems;
        int wpercentage = (int) percentage;
        double avg = value / numberOfDays;
        boolean target = avg >= 9.0;
        System.out.println("Report Value: " + value);
        System.out.println("Whole Percentage: " + wpercentage);
        System.out.println("Average Per Day: " + avg);
        System.out.println("Daily Target Reached: " + target);
    }
}
