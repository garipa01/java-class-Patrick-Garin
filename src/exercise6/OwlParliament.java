package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class OwlParliament
 * @author yasiro01
 */
public class OwlParliament {
    private HashSet<Owl> set;
    
    public OwlParliament(String FilePath) {
        set = new HashSet<Owl>();
        try {
            Scanner scan = new Scanner(new File(FilePath));
            ArrayList<String> line;
            Owl owl;
            while(scan.hasNextLine()){
                line = new ArrayList<String>(Arrays.asList(scan.nextLine().split(",")));
                if(line.contains("Owl")){
                    Integer num = Integer.parseInt(line.get(1));
                    owl = new Owl(line.get(0),num);
                    set.add(owl);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size(){
        return set.size();
    }
    
    public Owl getChief(){
       Owl max = new Owl("fake",-1);
       for(Owl owl: set){
           if(max.getAge() < owl.getAge() ){
               max = owl;
           }
       }
       
       return max;
    }
}
