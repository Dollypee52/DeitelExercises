  package Chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of students :");
        int students = input.nextInt();
        System.out.println("Enter no of subjects: ");
        int subjects = input.nextInt();
        int[][] valuesOfGrades = new int[students][subjects];
        int[][] total = new int[students][1];
        int[][] average = new int[students][1];

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.printf("Enter Student %d grade for subject %d",i+1,j+1);
                valuesOfGrades[i][j] = input.nextInt();
                sum = sum + valuesOfGrades[i][j];
                total[i][0] = sum;
                average[i][0] = sum / students;
            }
        }
        System.out.print("STUDENT    ");
        for (int i = 0; i < subjects ; i++) {
            System.out.print("SUB"+(i+1)+"   ");
        }
        System.out.print("   TOT ");
        System.out.print("AVE   ");
        System.out.println();
        for (int i = 0; i < students; i++) {
            System.out.print("Student"+(i+1)+"    ");
            for (int j = 0; j < subjects; j++) {
                System.out.print(valuesOfGrades[i][j] +"     ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.printf("%4d",total[i][j]);
            }
            for (int j = 0; j < 1; j++) {
                System.out.printf("%4d",average[i][j]);

            }
            System.out.println();
        }



    }
}
