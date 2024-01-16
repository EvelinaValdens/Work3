package models.persons;

import enums.Profession;
import models.animals.Animal;

public class Rachel extends Person {
    private Animal animal;
    public Rachel(String name, Profession profession, Animal animal) {
        super(name, profession);
        this.animal = animal;
    }

    public void callVeterinarian(Veterinarian veterinarian) {
        System.out.println(getName() + " должна была позвонить ветеринару, договориться насчет " + animal.getName());
        veterinarian.scheduleAppointment(animal);
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
