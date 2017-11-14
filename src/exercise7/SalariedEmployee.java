package exercise7;

/*
    Patrick Garin
    garipa01
    exercise7
 */
public class SalariedEmployee extends Employee {
    private double salary;
    public SalariedEmployee(String name_, String ssn_, double salary_) {
        super(name_, ssn_);
        salary = salary_;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void printWeeklyCheck(){
        System.out.printf("%s's weekly salary is $%f%n",this.name, salary);
    }
}
