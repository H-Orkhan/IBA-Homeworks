package HomeWork7;

public class Dog extends Pet implements Foul {

    Dog(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.Dog);
    }

    @Override
    public void foul() {
        System.out.println("I am a Dog and i did foul)");
    }

    @Override
    void respond() {
        System.out.println("I am a Dog and it is my respond");
    }
}
