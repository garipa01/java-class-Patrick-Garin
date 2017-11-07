package exercise5;

/**
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author yasiro01
 */
public class Room {
    private String building;
    private int number;
    
    public Room(String building_, int number_){
     building =  building_;
     number = number_;
    }
    
    public String getBuilding(){
        return building;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String toString(){
        return building + " " + number;
    }
}
