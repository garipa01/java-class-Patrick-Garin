package exercise6;

import java.util.Objects;

/**
 * Class Crow
 * @author yasiro01
 */
public class Crow {
    private String name;
    private Integer age;
    private Integer iq;
    public Crow(String name_, Integer age_){
        name = name_;
        age = age_;
        iq = 100;
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
        final Crow other = (Crow) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.iq, other.iq)) {
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

    public Integer getIq() {
        return iq;
    }

    @Override
    public String toString() {
        return "Crow{" + "name=" + name + ", age=" + age + ", iq=" + iq + '}';
    }
}
