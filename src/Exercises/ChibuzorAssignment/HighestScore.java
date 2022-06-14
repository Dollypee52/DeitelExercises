package Exercises.ChibuzorAssignment;

import java.util.Scanner;

public class HighestScore {
    //    (Find the highest score) Write a program that prompts the user to enter the num-
//ber of students and each student’s name and score, and finally displays the name
//of the student with the highest score
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int numberOfStudents = input.nextInt();
        int largestNo = 0;
        String bestStudent = " ";

        for(int i = 1; i <= numberOfStudents;i++){

        System.out.println("Enter name for each student: ");
        String studentNames = input.nextLine();
        input.nextLine();



        System.out.println("Enter student scores: ");
        int studentScores = input.nextInt();
        input.nextLine();
        if(studentScores > largestNo){
         largestNo = studentScores;
         bestStudent = studentNames;
        }

        }
        System.out.println("The best student score: " +largestNo);
    }
}
