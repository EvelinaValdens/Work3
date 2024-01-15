package models.persons;

public abstract class Person {
    protected String name;

   private Profession profession;

    public Person(String name, Profession profession) {
        this.name = name;
        this.profession = profession;
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
     public Profession getProfession(){
         return profession;
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
