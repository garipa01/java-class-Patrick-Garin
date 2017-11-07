package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 * @author yasiro01
 */
public class Laptop {
  private String manufacturer;
  private double price;
  private String color;
  
  public Laptop(String manufacturer_, double price_, String color_){
      manufacturer = manufacturer_;
      price = price_;
      color = color_;
  }
  
  public String getManufacturer(){
      return manufacturer;
  }
  
  public double getPrice(){
      return price;
  }
  
  public String getColor(){
      return color;
  }
  
  public void setPrice(double price_){
      price = price_;
  }
  
  public void setColor(String color_){
      color = color_;
  }
  
  public String toString(){
      return color + " laptop by " + manufacturer + " costs $" + price + "0";
  }
}
