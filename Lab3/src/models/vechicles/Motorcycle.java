package models.vechicles;

import enums.VehicleStatus;
import models.persons.Person;

public class Motorcycle extends Vehicle {
    public Motorcycle(String model) {
        super(model, VehicleStatus.ENGINE_OFF);
    }
    public void wave(Person person) {
        System.out.println("Мотоциклист помахал " + person.getName() + ", даже не оглянувшись.");
    }
}
