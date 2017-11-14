package exercise7;

/*
    Patrick Garin
    garipa01
    exercise7
 */
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;
    public HourlyEmployee(String name_, String ssn_, double wageRate_, double hours_) {
        super(name_, ssn_);
        wageRate = wageRate_;
        hours = hours_;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public void printWeeklyCheck(){
        double check = (hours * wageRate) / 52;
        System.out.printf("%s's weekly check is $%f%n", this.name, check);
    }
    
}
