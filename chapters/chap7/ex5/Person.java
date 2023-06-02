package chapters.chap7.ex5;

public class Person {
    private String name;
    private String birthday;
    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return name + " was born on " + birthday;
    }
}
