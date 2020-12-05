import java.io.IOException;
import java.util.Scanner;

public class Student extends Courses {

    // Class field(s)
    // String studentName; // Stores student name.
    public char studentPrompt;
    public boolean student01 = true;

    public void getStudentPrompt() throws IOException {

        while (student01) {

            //Scanner scan = new Scanner(System.in);

            // Receive and store student name.
            System.out.println("Welcome Student 1! What is your name?:");
            studentName = scan.nextLine(); // Input student name from user.
            System.out.println("Welcome " + studentName + ".");

            // Print out course.
            System.out.println("Please enter grades for " + printCourseOne() + ":");

            // Receive, store, and display student grades.
            storeGrades(courseOneGrades); // Input and store grades from student.

            // Test for 2D array.
            printGrades(courseOneGrades);



            // Calculate and display weighted overall student grade.
            System.out.println(calculateGradeWeight(courseOneGrades) + " %");
            weight = calculateGradeWeight(courseOneGrades); // Determine letter grade.
            System.out.println(checkGrade(weight)); // Display letter grade.

            // Create file and store student name, weighted overall student grade, and letter grade.
            createFile(weight, checkGrade(weight));




            // Investigate
            System.out.println("Would you like to continue inserting grades for " + courseOne + " (Yes or No)");
            studentPrompt = scan.next().toLowerCase().charAt(0);
            if (studentPrompt == 'y') {
                student01 = true;
                System.out.println("It works! Keep it up!");
            } else if (studentPrompt == 'n') {
                student01 = false;
                System.out.println("You're done!");
            } else {
                System.out.println("This is not a valid entry.");
                student01 = true;
            }
        }
        readFile();
        System.out.println(storage);
    }
}
