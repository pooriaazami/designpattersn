package patterns.Memento;

public class Originator {

    private String name;
    private String family;
    private int age;

    public Originator(String name, String family, int age) {
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

    public Memento createState() {
        return new Memento(name, family, age);
    }

    public void restoreState(Memento state) {
        this.name = state.getName();
        this.family = state.getFamily();
        this.age = state.getAge();
    }

}
