package Chapter3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Samson","Moses", 50000);
        Employee employee2 = new Employee("Folarin","Modupe",80000);
        System.out.println("The yearly salary for Samson Moses is: " + employee1.getYearlySalary());
        System.out.println("The yearly salary for Folarin Modupe is: " + employee2.getYearlySalary());
        System.out.println("------------------------------------------");
        System.out.println("The yearly salary for Samson after 10% raise is:"+ employee1.getIncrementInYearlySalary());
        System.out.println("The yearly salary for MOdupe after 10% raise is:"+ employee2.getIncrementInYearlySalary());
    }
}
