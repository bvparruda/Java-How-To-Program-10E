import java.sql.SQLOutput;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {

        Employee firstEmployee = new Employee(null,null, 0);
        Employee secondEmployee = new Employee(null,null, 0);
        Scanner input = new Scanner(System.in);

        System.out.print("First name of the 1º employee: ");
        String fnFirstEmployee = input.nextLine();
        firstEmployee.setFirstName(fnFirstEmployee);

        System.out.print("Last name of the 1º employee: ");
        String lnFirstEmployee = input.nextLine();
        firstEmployee.setLastName(lnFirstEmployee);

        System.out.print("Monthly salary of the 1º employee: $");
        double msFirstEmployee = input.nextDouble();
        firstEmployee.setMonthly_Salary(msFirstEmployee);

        double yearlySalary_FirstEmployee = 0;
        firstEmployee.getYearlySalary(yearlySalary_FirstEmployee);
        System.out.printf("The yearly Salary of the 1º employee without raise: $%.2f",firstEmployee.getYearlySalary(yearlySalary_FirstEmployee));


        double raiseYearlySalary_FirstEmployee = 0;
        firstEmployee.raiseYearlySalary(raiseYearlySalary_FirstEmployee);
        System.out.printf("%nThe yearly Salary of the 1º employee with raise: $%.2f",firstEmployee.raiseYearlySalary(raiseYearlySalary_FirstEmployee));


        //Do this same scheme with the second Employee, im exausted :/
    }
}