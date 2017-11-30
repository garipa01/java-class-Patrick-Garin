package exercise10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    ArrayList<Book> catalog;

  public BookShop() {
      catalog = new ArrayList<Book>();
  }
  
  public BookShop(String filename) throws FileNotFoundException {
      this();
      BufferedReader read = new BufferedReader(new FileReader(filename));
      try {
          String[] line;
          Book bk; 
            while (read.ready()){
                line = read.readLine().split(",");
                bk = new Book(line[0],line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3]));
                catalog.add(bk);
            }
            read.close();
       } catch (IOException ex) {
            Logger.getLogger(BookShop.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
       }
      
  }
  
  public BookShop(BookShop anotherBookShop) {
      this();
      for(int i = 0; i < anotherBookShop.catalog.size(); i++){
          catalog.add(new Book(anotherBookShop.catalog.get(i)));
      }
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
      Double percent =  1.0 - (discountPercent / 100.0);
      Double price;
      for(int i = 0; i < catalog.size(); i++){
          price = catalog.get(i).getPrice() * (percent);
          catalog.get(i).setPrice(price);
      }
  }
  
  public void printCatalog() {
      for(Book bk: catalog){
          System.out.println(bk);
      }
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }

}
