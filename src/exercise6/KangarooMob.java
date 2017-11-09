package exercise6;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {
    private HashSet<Kangaroo> set;
    
    public KangarooMob(String FilePath) {
        set = new HashSet<Kangaroo>();
        try {
            Scanner scan = new Scanner(new File(FilePath));
            ArrayList<String> line;
            Kangaroo kangaroo;
            while(scan.hasNextLine()){
                line = new ArrayList<String>(Arrays.asList(scan.nextLine().split(",")));
                if(line.contains("Kangaroo")){
                    Integer num = Integer.parseInt(line.get(1));
                    kangaroo = new Kangaroo(line.get(0),num);
                    set.add(kangaroo);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size(){
        return set.size();
    }
    
    public Kangaroo getChief(){
        Kangaroo max = new Kangaroo("fake",-1);
       for(Kangaroo kan: set){
           if(max.getAge() < kan.getAge() ){
               max = kan;
           }
       }
       
       return max;
    }
}
