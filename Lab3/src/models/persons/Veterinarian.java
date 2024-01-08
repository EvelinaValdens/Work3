package models.persons;

import models.animals.Animal;

public class Veterinarian extends Person{
    public Veterinarian(String name) {
        super(name);
    }
    public void scheduleAppointment(Animal animal) {
        System.out.println(getName() + " назначил встречу для " + animal.getName() + ".");
    }
}
