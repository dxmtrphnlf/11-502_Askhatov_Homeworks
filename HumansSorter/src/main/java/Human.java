/**
 * Created by Sodium on 24.02.2016.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + " " + this.age;
    }
}
