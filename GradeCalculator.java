import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        System.out.println("Enter the marks obtained (out of 100) for each subject one by one:");
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        scanner.close();
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        String grade;

        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks + " out of " +(numSubjects*100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}