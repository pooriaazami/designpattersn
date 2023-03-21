package patterns.Memento;

import java.util.Objects;

public class Memento {

    private String name;
    private String family;
    private int age;

    public Memento(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memento memento = (Memento) o;
        return age == memento.age && Objects.equals(name, memento.name) && Objects.equals(family, memento.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, age);
    }
}
