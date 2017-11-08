package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author yasiro01
 */
public class Roster {
  private ArrayList<Student> list; 
  
  public Roster(String filePath) throws IOException{
      list = new ArrayList<Student>();
      Student s;
      try {
          BufferedReader file = new BufferedReader(new FileReader(filePath));
          String[] line;
          Double gpa;
          for(int i = 0; i < 10; i++){
              line = file.readLine().split(",");
              gpa = Double.parseDouble(line[2]);
              s = new Student(line[0], line[1], gpa);
              list.add(s);
          }
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Roster.class.getName()).log(Level.SEVERE, null, ex);
      } 
  }
  
  public void printRoster(){
      for(int i = 0; i < list.size(); i++){
          System.out.println(list.get(i));
      }
  }
}
