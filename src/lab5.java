import java.util.Scanner;
public class lab5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // Step 1: Ask for total number of students
        System.out.print("Enter the number of students: ");
        int totalStudents = input.nextInt();
        // Step 2: Initialize variables for highest score
        int highestScore = 0;//stores the highest score found so far..
        int studentNumber = 0;//stores the student number with highest score...
        // Step 3: Loop to enter grades
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = input.nextInt();
            // Step 4: Check if this is the highest score..
            if (grade > highestScore) {
                highestScore = grade;//update a highest score
                studentNumber = i;
            }
        }// Step 5: Display the result
        System.out.println("Student " + studentNumber + " has the highest score: " + highestScore);
    }
}