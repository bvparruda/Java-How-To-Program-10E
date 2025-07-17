public class Employee {
    private String firstName;
    private String lastName;
    private double monthly_Salary;

    public Employee(String firstName, String lastName, double monthly_Salary){

          this.firstName = firstName;
          this.lastName = lastName;

          if (monthly_Salary>0.0){
              this.monthly_Salary = monthly_Salary;
          }
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthly_Salary(double monthly_Salary){
        if (monthly_Salary>0.0) {
            this.monthly_Salary = monthly_Salary;
        }

        if (monthly_Salary<0.0){
            this.monthly_Salary = monthly_Salary;
            monthly_Salary = 0;
        }
    }

    public double getMonthly_Salary() {
        return monthly_Salary;
    }


    public double getYearlySalary(double yearlySalary){
        yearlySalary = monthly_Salary*12;
        return yearlySalary;
    }

    public double raiseYearlySalary (double salaryWithRaise){
        salaryWithRaise = (monthly_Salary*12) + (monthly_Salary*12)*10/100 ;
        return salaryWithRaise;
    }
}
