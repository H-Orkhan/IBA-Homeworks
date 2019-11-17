package HomeWork9;


import java.util.HashSet;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits = new HashSet<>();

    public void setSpecies(Species species) {
        this.species = species;
    }

    Pet(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        habits.add(habit1);
        habits.add(habit2);
        habits.add(habit3);
    }

    Pet(Species species) {
        species = Species.UNKNOWN;
    }

    @Override
    public String toString() {
        return this.species + " nickname = " + this.nickname + " age = " + this.age + " trickLevel = "
                + this.trickLevel + " habits = " + this.getHabits();
    }

    private String getHabits() {
        return String.valueOf(habits);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (hashCode(this) != hashCode(that)) return false;
        if (!(that instanceof Pet)) return false;
        return this.nickname.equals(((Pet) that).nickname) && this.age == ((Pet) that).age
                && this.species == ((Pet) that).species;
    }

    private int hashCode(Object pet) {
        return hashCode();
    }

    @Override
    protected void finalize() {
        System.out.println("Object " + this.getClass().getName());
    }

    void eat() {
        System.out.println("I am eating");
    }

    abstract void respond();

}
