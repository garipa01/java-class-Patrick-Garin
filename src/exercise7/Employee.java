package exercise7;

/*
    Patrick Garin
    garipa01
    exercise7
 */
public class Employee {
    protected String name;
    protected String ssn;
    private Double netPay;
    
    public Employee(String name_, String ssn_){
        name = name_;
        ssn = ssn_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
