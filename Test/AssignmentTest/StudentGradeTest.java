package AssignmentTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeTest {
    @Test
    public void testForSumPerStudent() {
        int[][] grades = {{90, 20, 40},
                {40, 40, 20}};
        StudentGradesReport report = new StudentGradesReport(grades);
        int result = report.getSumPerStudent(0);
        assertEquals(150, result);
        result = report.getSumPerStudent(1);
        assertEquals(100, result);
    }
    @Test
    public void testForStudentAverage(){
        int [][] grades = {{4, 9,8},{20, 20 ,20}};
        StudentGradesReport report = new StudentGradesReport(grades);
        double result = report.getAverageForStudent(0);
        assertEquals(7.0,result);

    }
//    @Test
//    public void testForStudentPosition(){
//        int[][] grades = {{4, 9, 8, 6},{8, 8, 7, 2},{2, 3,4,5}};
//        StudentGradesReport report = new StudentGradesReport(grades);
//        assertEquals(3,report.getStudentPosition(0));
//
//
//    }

}
