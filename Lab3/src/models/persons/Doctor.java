package models.persons;

public class Doctor extends Person {
    public Doctor(String name) {
        super(name);
    }
    public void shareWisdom(String wisdom) {
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
            this.memory = memory;
        }

        public void recallMemory() {
            System.out.println("Вспоминая: " + memory);
        }
    }
}
