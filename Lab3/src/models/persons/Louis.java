package models.persons;

import exceptions.NoEmptySpaces;
import interfaces.MoveAction;
import models.other.University;
import models.vechicles.Car;

public class Louis extends Person {
    public Louis(String name) {
        super(name);
    }

    public void driveCar(Car car, University university) {
        System.out.println(getName() + " ведет " + car.getModel() + " в сторону " + university + ".");
        car.start();
    }

    public void listenToMusic(String song) {
        System.out.println(getName() + " прибавил звук и запел " + song + " плохо, но с большим удовольствием.");
    }

    public Louis kiss(Person person) {
        System.out.println(getName() + " целует " + person.getName());
        return this;
    }
    public Louis leaves(){
        System.out.println(getName() + " выходит.");
        return this;
    }

    public void getIntoCar(Car car) throws NoEmptySpaces {
        if (car.isEmptySpace(this)){
            System.out.println("Он залез в " + car.getModel() + " которую они получили от университета и выехал на дорогу.");
            MoveAction moveToUniversity = destination -> System.out.println("Едет в сторону " + destination);
            moveToUniversity.move("университет.");
        } else {
            throw new NoEmptySpaces("В машине не оказалось свободных мест. Он взял другую свободную.");
        }
    }
    public void reflects(String reflects) {
        System.out.println(getName() + " размышляет: \""+ reflects + "\"");
    }
    public University noticeAndDriveToUniversity(University university) {
        System.out.println("Первое, что он заметил, подъехав к " + university.getName() + ":");
        return university;
    }
    public Louis brakeHard() {
        System.out.println(getName() + " резко затормозил, чтобы пропустить два последних, мчащихся от Дунн-холла.");
        return this;
    }
    public Louis continueDriving() {
        System.out.println(getName() + " , вздохнув, поехал дальше.");
        return this;
    }
}