package AssignmentTest;

public class StudentGradesReport {
    int[][] grades;

    public StudentGradesReport(int[][] grades) {
        this.grades = grades;

    }

    public int getSumPerStudent(int indexNumber) {
        int sum = 0;
        for (int j = 0; j < grades[indexNumber].length; j++) {
            sum = sum + grades[indexNumber][j];
        }

        return sum;
    }

    public double getAverageForStudent(int indexNumber) {
        double average = 0;
        for (int j = 0; j < grades[indexNumber].length; j++) {
            average = (double) getSumPerStudent(indexNumber) / grades[indexNumber].length;
        }


        return average;
    }

//    public int getStudentPosition(int indexNumber) {
//        int[] arrayOfStudentSum = new int[grades.length];
//
//        for (int student = 0; student < grades.length; student++) {
//            int sum = 0;
//        }
//        return ;
//    }
}
