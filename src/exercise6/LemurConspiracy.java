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
 * Class LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {
    private HashSet<Lemur> set;
    
    public LemurConspiracy(String FilePath) {
        set = new HashSet<Lemur>();
        try {
            Scanner scan = new Scanner(new File(FilePath));
            ArrayList<String> line;
           Lemur lemur;
            while(scan.hasNextLine()){
                line = new ArrayList<String>(Arrays.asList(scan.nextLine().split(",")));
                if(line.contains("Lemur")){
                    Integer num = Integer.parseInt(line.get(1));
                    lemur = new Lemur(line.get(0),num);
                    set.add(lemur);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size(){
        return set.size();
    }
    
    public Lemur getChief(){
        Lemur max = new Lemur("fake",-1);
       for(Lemur len: set){
           if(max.getAge() < len.getAge() ){
               max = len;
           }
       }
       
       return max;
    }
}
