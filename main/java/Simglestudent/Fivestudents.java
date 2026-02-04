/*
 
 */
package Simglestudent;
import java.util.Scanner;
/**
 *
 * @author kasin
 */
public class Fivestudents {
    
public class FiveStudentsGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;

        // Array to count how many students got each grade (1–9)
        int[] gradeCount = new int[10]; // index 1–9 used

        while (count <= 5) {
            System.out.print("Enter score for student " + count + ": ");
            int score = input.nextInt();

            int grade = 0;

            if (score >= 80 && score <= 100) {
                grade = 1;
            } else if (score >= 75) {
                grade = 2;
            } else if (score >= 66) {
                grade = 3;
            } else if (score >= 60) {
                grade = 4;
            } else if (score >= 50) {
                grade = 5;
            } else if (score >= 45) {
                grade = 6;
            } else if (score >= 35) {
                grade = 7;
            } else if (score >= 30) {
                grade = 8;
            } else if (score >= 0) {
                grade = 9;
            } else {
                System.out.println("Invalid score! Try again.");
                continue; // repeat same student
            }

            gradeCount[grade]++; // count grade
            count++;
        }

        // Display summary
        System.out.println("\n--- SUMMARY OF GRADES ---");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Grade " + i + ": " + gradeCount[i] + " student(s)");
        }
    }
}
}
