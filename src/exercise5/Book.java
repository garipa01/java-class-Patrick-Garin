package exercise5;

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author yasiro01
 */
public class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title_, String author_, double price_){
        title = title_;
        author = author_;
        price = price_;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String toString(){
        return title + " by " + author + " costs " + price;
    }
}
