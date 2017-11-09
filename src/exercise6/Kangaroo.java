package exercise6;

import java.util.Objects;

/**
 * Class Kangaroo
 * @author yasiro01
 */
public class Kangaroo {
    private String name;
    private Integer age;
    private Integer babies;
    
    public Kangaroo(String name_, Integer age_){
        name = name_;
        age = age_;
        babies = 1;
    }

    @Override
    public String toString() {
        return "Kangaroo{" + "name=" + name + ", age=" + age + ", babies=" + babies + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.age);
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
        final Kangaroo other = (Kangaroo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.babies, other.babies)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getBabies() {
        return babies;
    }
}
