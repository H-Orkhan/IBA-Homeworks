package HomeWork5;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    Pet() {
    }

    void setSpecies(String species) {
        this.species = species;
    }

    String getNickname() {
        return nickname;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    void setAge(int age) {
        this.age = age;
    }


    void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    @Override
    public String toString() {
        return this.species + " nickname = " + this.nickname + " age = " + this.age + " trickLevel = " + this.trickLevel + " habits = " + this.getHabits();
    }

    private String getHabits() {
        return habits[0] + " " + habits[1] + " " + habits[2];
    }


    void setHabits(String habit1, String habit2, String habit3) {
        habits = new String[]{habit1, habit2, habit3};
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (hashCode(this) != hashCode(that)) return false;
        if (!(that instanceof Pet)) return false;
        return this.nickname.equals(((Pet) that).nickname) && this.age == ((Pet) that).age && this.species.equals(((Pet) that).species);
    }

    private int hashCode(Object pet) {
        return hashCode();
    }

}
