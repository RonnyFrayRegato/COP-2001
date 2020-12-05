import java.util.Scanner;

public class Assignments {

    Scanner scan = new Scanner(System.in);

    double quiz = 0.20;
    double exam = 0.30;
    double homework = 0.25;
    double project = 0.25;
    double weight;

    String [] assignments = {"Quiz", "Exam", "Homework", "Project"};

    double [][] courseOneGrades = new double[4][4] ; // 2D Array for storing Course 1 grades.

    protected void storeGrades(double [][] enterGrades) {
        for (int i = 0; i < enterGrades.length; i++) {
            for (int j = 0; j < enterGrades[i].length; j++) {
                System.out.print(assignments[i] + " " + (j + 1) + ": ");
                enterGrades[i][j] = scan.nextDouble(); // Input student grades from user.
            }
        }
    }

    protected void printGrades (double [][] array) {
        System.out.println("All grades for course 1: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double calculateGradeWeight(double [][] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                weight = ((quiz * array2[0][j]) + (exam * array2[1][j]) + (homework * array2[2][j]) +
                        (project * array2[3][j]));

            }
        }
        return weight;
    }

    public char checkGrade(double weight) {
        if (weight >= 90) {
            return 'A';
        } else if (weight >= 80 && weight <= 89) {
            return 'B';
        } else if (weight >= 70 && weight <= 79) {
            return 'C';
        } else if (weight >= 60 && weight <=69) {
            return 'D';
        } else {
            return 'F';
        }
    }
}