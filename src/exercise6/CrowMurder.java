package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private ArrayList<Crow> list;
    public CrowMurder(String FilePath) {
        list = new ArrayList<Crow>();
        try {
            Scanner scan = new Scanner(new File(FilePath));
            ArrayList<String> line;
            Crow crow;
            while(scan.hasNextLine()){
                line = new ArrayList<String>(Arrays.asList(scan.nextLine().split(",")));
                if(line.contains("Crow")){
                    Integer num = Integer.parseInt(line.get(1));
                    crow = new Crow(line.get(0),num);
                    list.add(crow);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size(){
        return list.size();
    }
    
    public Crow getChief(){
        int index = -1;
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAge() > min){
                index = i;
                min = list.get(i).getAge();
            }
        }
        return list.get(index);
    }
    
}
