package Assignment;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 1; i <= 5; i++) {


            System.out.println("Enter student name");
            String studentName = input.nextLine();
            System.out.println("Enter student grade");
            String studentGrade = input.nextLine();

            switch (studentGrade.toUpperCase()) {
                case "A": {
                    countA++;
                    break;
                }
                case "B": {
                    countB++;
                    break;
                }
                case "C": {
                    countC++;
                    break;
                }
                case "D": {
                    countD++;
                    break;}
                default: {
                    System.out.println("student grade not included");
                    break;
                }
            }
            System.out.println(countA+ " students had A");
            System.out.println(countB+ "students had B");
            System.out.println(countC+ "students had C");
            System.out.println(countD+ "students had D");
        }
    }

}
