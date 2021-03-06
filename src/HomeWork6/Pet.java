package HomeWork6;
public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String [] habits;

    public Pet(Species species, String nickname , int age, int trickLevel, String[] habit) {
        this.species= species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel = trickLevel;
        this.habits = habit.clone();
    
    }

    String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return this.species + " nickname = " + this.nickname + " age = " + this.age + " trickLevel = " + this.trickLevel + " habits = " + this.getHabits();
    }

    private String getHabits() {
        return habits[0] + " " + habits[1] + " " + habits[2];
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

    @Override
    protected void finalize() {
        System.out.println("Object "+this.getClass().getName());
    }


    public void setSpecies(String dog) {
    }
}
