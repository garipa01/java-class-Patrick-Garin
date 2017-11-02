/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author garipa01
 */
public class Ex4DriverTest {
    
    public Ex4DriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        Integer I = 10;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 20;
        Integer result = instance.task1(I);
        assertEquals(expResult, result);
        I = 30;
        expResult = 60;
        result = instance.task1(I);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTask2() {
        System.out.println("task2");
        String n = "Patrick";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 7;
        Integer result = instance.task2(n);
        assertEquals(expResult, result);
        n = "Garin";
        expResult = 5;
        result = instance.task2(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask3(){
        System.out.println("task3");
        char c = 'A';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 65;
        Integer result = instance.task3(c);
        assertEquals(expResult, result);
        c = 'z';
        expResult = 122;
        result = instance.task3(c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask4(){
        System.out.println("task4");
        String s = "Patrick";
        Ex4Driver instance = new Ex4Driver();
        char expResult = 'P';
        char result = instance.task4(s);
        assertEquals(expResult, result);
        s = "garin";
        expResult = 'g';
        result = instance.task4(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask5(){
        System.out.println("task5");
        Integer n = 10;
        Integer k = 12;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 22;
        Integer result = instance.task5(n,k);
        assertEquals(expResult, result);
        n = 30;
        k = 100;
        expResult = 130;
        result = instance.task5(n,k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask6(){
        System.out.println("task6");
        String s = "Patrick";
        Integer k = 2;
        Ex4Driver instance = new Ex4Driver();
        char expResult ='t';
        char result = instance.task6(s,k);
        assertEquals(expResult, result);
        k = 5;
        expResult = 'c';
        result = instance.task6(s,k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask7(){
        System.out.println("task7");
        Integer[] x = new Integer[12];
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 12;
        Integer result = instance.task7(x);
        assertEquals(expResult, result);
        x = new Integer[100];
        expResult = 100;
        result = instance.task7(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask8(){
        System.out.println("task8");
        Integer[] x = new Integer[45];
        int i = 45;
        Ex4Driver instance = new Ex4Driver();
        boolean expResult = true;
        boolean result = instance.task8(x, i);
        assertEquals(expResult, result);
        i = 13;
        expResult = false;
        result = instance.task8(x, i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask9(){
        System.out.println("task9");
        ArrayList<String> x = new ArrayList<String>();
        for(int i = 0; i < 12; i++)
            x.add("");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 12;
        Integer result = instance.task9(x);
        assertEquals(expResult, result);
        x = new ArrayList<String>();
        for(int i = 0; i < 167; i++)
            x.add("");
        expResult = 167;
        result = instance.task9(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask10(){
        System.out.println("task10");
        HashMap<Integer,String> x = new HashMap<Integer,String>();
        for(int i = 0; i < 12; i++)
            x.put(i,"");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 12;
        Integer result = instance.task10(x);
        assertEquals(expResult, result);
        x = new HashMap<Integer,String>();
        for(int i = 0; i < 167; i++)
            x.put(i,"");
        expResult = 167;
        result = instance.task10(x);
        assertEquals(expResult, result);
    }
}
