package exercise6;

import java.util.Objects;

/**
 * Class Lemur
 * @author yasiro01
 */
public class Lemur {
    private String name;
    private Integer age;
    private Integer tailLength;
    
    public Lemur(String name_, Integer age_){
        name = name_;
        age = age_;
        tailLength = 20;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.age);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lemur other = (Lemur) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.tailLength, other.tailLength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lemur{" + "name=" + name + ", age=" + age + ", tailLength=" + tailLength + '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getTailLength() {
        return tailLength;
    }
}
