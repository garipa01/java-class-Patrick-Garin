package exercise5;

/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author yasiro01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private boolean fullTime;
    
    public Employee(String fname, String lname, double salary_, boolean fullTime_){
        firstName = fname;
        lastName = lname;
        salary = salary_;
        fullTime = fullTime_;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public boolean isFullTime(){
        return fullTime;
    }
    
    public String toString(){
       if(fullTime){
           return firstName + " " + lastName + " earns $" + salary + "0 annually";
       } else {
           return firstName + " " + lastName + " earns $" + salary + "0 hourly";
       }
    }
}
