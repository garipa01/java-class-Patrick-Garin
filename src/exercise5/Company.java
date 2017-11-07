package exercise5;

/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author yasiro01
 */
public class Company {
    private String name;
    private double stockPrice;
    
    public Company(String name_, double stockPrice_){
        name = name_;
        stockPrice = stockPrice_;
    }
    
    public String getName(){
        return name;
    }
    
    public double getStockPrice(){
        return stockPrice;
    }
    
    public void setStockPrice(double stockPrice_){
        stockPrice = stockPrice_;
    }
    
    public String toString(){
        return name + " trading at $" + stockPrice + "0";
    }
}
