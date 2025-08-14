import java.util.Scanner;
public class lab5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask for total number of students
        System.out.print("Enter the number of students: ");
        int totalStudents = input.nextInt();
        //Initialize variables for highest score
        int highestScore = 0;//stores the highest score found so far..
        int studentNumber = 0;//stores the student number with highest score...
        // Loop to enter grades
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = input.nextInt();
            //Check if this is the highest score..
            if (grade > highestScore) {
                highestScore = grade;//update a highest score
                studentNumber = i;
            }
        }// Display the result
        System.out.println("Student " + studentNumber + " has the highest score: " + highestScore);
    }
}