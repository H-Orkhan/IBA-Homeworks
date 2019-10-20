package HomeWork4;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    static String [] habits = new String [] {"eat","drink","sleep"};

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
    public void eat ()
    {
        System.out.println("I am eating");
    }
    public void respond ()
    {
        System.out.printf("Hello, owner. I am - [%s]. I miss you!",nickname);
    }
    public void foul ()
    {
        System.out.println("I need to cover it up");
    }

    public void toString(Pet Dog)
    {
      System.out.printf("%s{nickname='%s', age=%d, trickLevel=%d, habits=[%s,%s,%s]}",species,nickname,age,trickLevel,habits[0],habits[1],habits[2]);
    }
}
