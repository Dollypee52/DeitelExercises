package Chapter8.chapter5.ArraysPractice;

public class GradeBook {
    private String courseName;
    private int[][] grades;


    public GradeBook(String courseName, int[][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    // method to set the courseName
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    //method to retrieve the course name
    public String getCourseName(){
        return courseName;
    }
    //perform various operations on the data
    public void processGrades() {

    }
}
