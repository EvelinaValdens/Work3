package models.persons;
import enums.Profession;
import models.animals.Animal;

public class Veterinarian extends Person{
    public Veterinarian(String name, Profession profession) {
        super(name, profession);
    }
    public void scheduleAppointment(Animal animal) {
        System.out.println(getName() + " назначил встречу для " + animal.getName() + ".");
    }
}
