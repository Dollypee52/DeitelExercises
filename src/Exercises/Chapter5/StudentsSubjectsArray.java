package Exercises.Chapter5;


import java.util.Scanner;

public class StudentsSubjectsArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter no of Students in a class: ");
        int noOfStudents = input.nextInt();
        System.out.println("Enter no of subjects:");
        int noOfSubjects = input.nextInt();

        int[][] valueOfGrades = new int[noOfStudents][noOfSubjects];
        int [][] total = new int [noOfStudents][1];
        double [][] average = new double[noOfStudents][1];
        System.out.println("Enter the grades of each students and subjects");
         int sum = 0;
        for (int i = 0; i < noOfStudents; i++) {
            for (int j = 0; j < noOfSubjects; j++) {
                int result =input.nextInt();
                valueOfGrades[i][j] = result;
//                total += result;
//                System.out.println(total);
//                average = total / noOfSubjects;
            }
            System.out.println();
        }

        for (int i = 0; i < noOfStudents; i++) {
            for (int j = 0; j < noOfSubjects; j++) {
                sum = sum + valueOfGrades[i][j];
            }
            total[i][0] = sum;
            average[i][0] = sum * 1.0 / noOfSubjects;
        }

        for (int i = 0; i < noOfStudents; i++) {

            for (int j = 0; j < noOfSubjects; j++) {
                System.out.print(valueOfGrades[i][j] + " ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(total[i][j] + " ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(average[i][j] + " ");
            }
            System.out.println();
        }
    }
}
