package Chapter3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

   public Employee(String firstname, String lastname, double monthlySalary) {
       this.firstName = firstname;
       this.lastName = lastname;
       this.monthlySalary = monthlySalary;
   }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double getYearlySalary(){
       return (monthlySalary * 12);
    }
    public double getIncrementInYearlySalary(){
       return((monthlySalary * 12 * 0.1 + monthlySalary) );
    }
}
