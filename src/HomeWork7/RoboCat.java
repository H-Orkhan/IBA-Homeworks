package HomeWork7;

public class RoboCat extends Pet implements Foul {
    RoboCat(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.RoboCat);
    }

    @Override
    public void foul() {
        System.out.println("I am a RoboCat and it is my foul)");
    }

    @Override
    void respond() {
        System.out.println("I am a RoboCat xe-xe-xe and it is my respond");
    }
}
