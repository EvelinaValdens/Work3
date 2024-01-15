package models.persons;

import enums.Feellings;
import enums.Profession;

public abstract class Person {
    private String name;
    private Profession profession;

    private Feellings feellings;

    public Person(String name, Profession profession) {
        this.name = name;
        this.profession = Profession.UNKNOWN;
        feellings = Feellings.NOTHING;
    }


    public void speak(String words) {
        System.out.println(name + " говорит, \"" + words + "\"");
    }

    public Feellings getFeellings(){return feellings;}
    public void setFeellings(Feellings feellings) { this.feellings = Feellings.NOTHING; }
    public void laugh () {
        setFeellings(Feellings.HAPPY);
        System.out.println(name + " смеется.");
    }

    public void think(String thoughts) {
        setFeellings(Feellings.SAD);
        System.out.println(name + " думает, \"" + thoughts + "\"");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession(){return profession;}
    public void setProfession() {
        this.profession = Profession.UNKNOWN;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

