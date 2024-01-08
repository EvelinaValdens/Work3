package models.persons;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void speak(String words) {
        System.out.println(name + " говорит, \"" + words + "\"");
    }

    public void laugh() {
        System.out.println(name + " смеется.");
    }

    public void think(String thoughts) {
        System.out.println(name + " думает, \"" + thoughts + "\"");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
