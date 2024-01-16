package models.persons;

import enums.Feellings;
import enums.Profession;

public class Doctor extends Person {
    public Doctor(String name, Profession profession) {
        super(name, profession);
    }
    public void shareWisdom(String wisdom) {
        setFeellings(Feellings.NOTHING);
        System.out.println(getName() + " делится своими знаниями: \"" + wisdom + "\"");
    }
    public static class ProfessionalLife {
        public static void reflectOnMedicalKnowledge() {
            System.out.println("Медицинские знания: Смерть так же естественна, как рождение.");
        }

    }
    public class PersonalMemories {
        private String memory;

        public PersonalMemories(String memory) {
            setFeellings(Feellings.MOODSTAYCALM);
            this.memory = memory;
        }

        public void recallMemory() {System.out.println("Вспоминая: " + memory);
        }
    }
}

