package Cloneworksandpractice;


import java.util.Scanner;

public class pupilSubjectArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of pupil: ");
        int pupil = input.nextInt();
        System.out.println("Enter no of subject:");
        int subject = input.nextInt();

        int[][] grades = new int[pupil][subject];
        int[][] total = new int[pupil][1];
        int[][] average = new int[pupil][1];

        for(int i=0; i<pupil; i++){
            int sum = 0;
            for(int j=0; j<subject; j++){
                System.out.printf("Enter pupil %d grade for subject %d", i+1,j+1);
                grades[i][j]= input.nextInt();
                sum += grades[i][j];
                total[i][0]= sum;
                average[i][0]= sum/pupil;
            }
        }
        System.out.print("PUPIL   ");
        for(int i=0; i<subject; i++){
            System.out.print("SUB" + (i+1) + " ");
        }
        System.out.print("   TOT ");
        System.out.print("AVG  ");
        System.out.println();
        for(int j=0; j<subject; j++){
            System.out.println();
        }
    }
}
