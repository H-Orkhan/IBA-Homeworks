package HomeWork4;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    static String[] habits = new String[]{"eat", "drink", "sleep"};

    public Pet() { }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        toString();
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                '}';
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - [%s]. I miss you!", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

}
