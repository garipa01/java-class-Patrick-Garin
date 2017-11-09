package exercise6;

import java.util.Objects;

/**
 * Class Owl
 * @author yasiro01
 */
public class Owl {
    private String name;
    private Integer age;
    private String wisdom;
    
    public Owl(String name_, Integer age_){
        name = name_;
        age = age_;
        wisdom = "medium";
    }

    @Override
    public String toString() {
        return "Owl{" + "name=" + name + ", age=" + age + ", wisdom=" + wisdom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.age);
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
        final Owl other = (Owl) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.wisdom, other.wisdom)) {
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

    public String getWisdom() {
        return wisdom;
    }
}
