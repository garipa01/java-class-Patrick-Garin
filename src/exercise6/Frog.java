package exercise6;

import java.util.Objects;

/**
 * Class Frog
 * @author yasiro01
 */
public class Frog {
    private String name;
    private Integer age;
    private String color;
    
    public Frog(String name_, Integer age_){
        name = name_;
        age = age_;
        color = "Green";
    }

    @Override
    public String toString() {
        return "Frog{" + "name=" + name + ", age=" + age + ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.age);
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
        final Frog other = (Frog) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
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

    public String getColor() {
        return color;
    }
}
