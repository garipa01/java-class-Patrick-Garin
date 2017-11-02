package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author yasiro01
 */
public class Ex4Driver {
//Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task1(Integer I){
    return I * 2;
}
//Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task2(String n){
    return n.length();
}
//Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task3(Character c){
    return c.hashCode();
}
//Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity.
public Character task4(String s){
    return s.charAt(0);
}
//Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task5(Integer n , Integer k){
    return n + k;
}
//Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity.
public Character task6(String s , Integer i){
    return s.charAt(i);
}
//Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task7(Integer[] x){
  return x.length;  
}
//Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity.
public Boolean task8(Integer[] x , Integer i){
    return x.length == i;
}
//Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task9(ArrayList<String> x){
    return x.size();
}

//Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task10(HashMap<Integer,String> x){
   return x.size();
}
 
}
