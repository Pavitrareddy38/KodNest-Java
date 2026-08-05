
public class Main5 {

    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int learningHours = 3;
        int learningDays = 5;
        int remaingTopics = totalTopics - completedTopics;
        int weeklyLearningHours = learningHours * learningDays;
        double progressPercentage = completedTopics * 100 / totalTopics;
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remaingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
