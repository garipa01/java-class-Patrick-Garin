package exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yasiro01
 */
public class Ex2Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException {
    File file = new File(filename);
    PrintWriter write = new PrintWriter(file);
    for (int[] row: matrix) {
      for (int item: row) {
        write.printf("%5d", item);
      }
      write.print("\n");
    }
    write.close();
  }
    
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException {
    Scanner scan = new Scanner(new File(filename));
    String first_row = scan.nextLine();
    String [] row_col = first_row.split(" ");
    int row = Integer.parseInt(row_col[0]);
    int col = Integer.parseInt(row_col[1]);
    int[][] matrix = new int[row][col];
    int count = 0;
    while(scan.hasNextLine() && count <= row){
        String matrix_nums = scan.nextLine();
        String [] nums = matrix_nums.split(" ");
        for(int i = 0; i < col; i++){
            matrix[count][i] = Integer.parseInt(nums[i]); 
        }
        count++;
    } 
    scan.close();
    return matrix;
  }
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
      int m = matrix1.length;
      int q = matrix2[0].length;
      int p = matrix2.length;
      int[][] sum_array = new int[m][q];
      for(int i = 0; i < m;i++){
        for(int j = 0; j < q ;j++){
            for(int k = 0; k < p; k++){
                sum_array[i][j] += matrix1[i][k]*matrix2[k][j];
            }
        }
      }
      return sum_array;
    }
}
