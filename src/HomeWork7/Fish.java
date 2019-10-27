package HomeWork7;

public class Fish extends Pet {

    Fish(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.Fish);
    }
    @Override
    void respond() {
        System.out.println("I amk a fish and it is my respond");
    }
}
