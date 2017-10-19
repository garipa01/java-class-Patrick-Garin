package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    for(int i = 1; i <= 100; i++){
        if(i % 3 == 0 && i % 5 ==0) {
            System.out.print("Huh ");
        } 
        else if(i % 3 ==0){
            System.out.print("foo ");
        }
        else if(i % 5 == 0){
            System.out.print("bar ");
        }
        else{
            System.out.print(i + " ");
        }
    }
    System.out.println();
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    int sum = 0;
    for(int i = 1; i <= 100; i++){
        if(i % 7 ==0){
            sum = sum + i;
        }
    }
    System.out.println("" + sum);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
      int sum = 0;
      long product = 1;
      for(int i = 1; i <= 20; i++){
          sum = sum + i;
          product = product * i;
    }
      System.out.println("Sum of 1-20: " + sum + " Product of 1-20: " + product);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter your full name (First Middle Last).");
    String name = scan.nextLine();
    String[] list = name.split(" ");
    String fletter = list[0].substring(0,1);
    String mletter = list[1].substring(0,1);
    String lletter = list[2].substring(0,1);
    System.out.println(fletter + mletter + lletter);
    
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    throw new UnsupportedOperationException("Task 6 is not implemented yet.");
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    Random rnd = new Random();
    rnd.setSeed(252);
    throw new UnsupportedOperationException("Task 7 is not implemented yet.");
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    throw new UnsupportedOperationException("Task 8 is not implemented yet.");
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    throw new UnsupportedOperationException("Task 9 is not implemented yet.");
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
