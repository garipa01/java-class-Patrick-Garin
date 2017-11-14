/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author garipa01
 */
public class teststuff {
    public static void main(String[] args){
        HourlyEmployee me = new HourlyEmployee("Patrick Garin", "000-00-000", 14.00, 1234);
        SalariedEmployee you = new SalariedEmployee("Matt Johnson", "123-45-678", 5000);
        System.out.println(me.getName());
        System.out.println(me.getSsn());
        System.out.println(""+ me.getHours());
        System.out.println("" + me.getWageRate());
        me.printWeeklyCheck();
         System.out.println(you.getName());
        System.out.println(you.getSsn());
        System.out.println(you.getSalary());
        you.printWeeklyCheck();
    }
}
