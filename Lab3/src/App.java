import enums.Seasons;
import enums.WeatherStatus;
import exceptions.NoEmptySpaces;
import interfaces.MoveAction;
import models.animals.Cat;
import models.other.University;
import models.persons.*;
import models.vechicles.Bicycle;
import models.vechicles.Car;
import models.other.Weather;
import models.vechicles.Motorcycle;

public class App {
    public static void main(String[] args) {
        Louis louis = new Louis("Луис");
        Doctor doctor = new Doctor("Доктор");
        Rachel rachel = new Rachel("Рэчел", new Cat("Черч"));
        Veterinarian veterinarian = new Veterinarian("Ветеринар");
        Car hondaCivic = new Car("хонда-сивик", 4);
        Zelda zelda = new Zelda("Зельда");
        Motorcycle motorcycle = new Motorcycle("Мотоцикл");
        Weather currentWeather = new Weather(72, WeatherStatus.CLEAR);
        University university = new University("Университет");

        louis.speak("Хорошо, " + doctor.getName());
        doctor.laugh();
        louis.laugh();
        zelda.haunt(louis);
        louis.think("Ты так и не можешь забыть Зельду и то, как она умерла?");
        Doctor.ProfessionalLife.reflectOnMedicalKnowledge();
        doctor.new PersonalMemories("Луис был смренным и задумчивым.");

        louis.kiss(rachel).leaves();

        try {
            currentWeather.displayWeather(Seasons.getRandomSeason());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            louis.getIntoCar(hondaCivic);
        } catch (NoEmptySpaces e) {
            System.out.println(e.getMessage());
            louis.driveCar(hondaCivic, university);
        }
        rachel.callVeterinarian(veterinarian);
        louis.reflects("Не следует думать о смерти и кладбище для домашних животных в такое прекрасное сентябрьское утро.");

        hondaCivic.playMusic("Ramones - Rockaway Beach");
        louis.listenToMusic("Ramones - Rockaway Beach");

        louis.noticeAndDriveToUniversity(university).displayActivity();
        louis.brakeHard().think("Мотоциклисты и велосипедисты считают все должны уступать им дорогу.");
        motorcycle.wave(louis);
        louis.continueDriving();
    }
}
