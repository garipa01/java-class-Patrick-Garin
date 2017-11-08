package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author yasiro01
 */
public class Student {
    private String name;
    private String major;
    private double gpa;
    
    public Student(String name_, String major_, double gpa_){
        name = name_;
        major = major_;
        gpa = gpa_;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMajor(){
        return major;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public void setMajor(String major_){
        major = major_;
    }
    
    public void setGpa(double gpa_){
        gpa = gpa_;
    }
    
    public String toString(){
        return name + " is majoring in " + major + " with a GPA of " + gpa;
    }

  
}
