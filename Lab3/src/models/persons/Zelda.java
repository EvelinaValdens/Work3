package models.persons;

public class Zelda extends Person{
    public Zelda(String name) {
        super(name);
    }

    public void haunt(Louis louis) {
        System.out.println(getName() + " все еще сидит в " + louis.getName() + ".");
    }
}
