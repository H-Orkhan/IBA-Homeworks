package HomeWork5;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[10];
    private Pet pet;
    private int count = 0;
    private static int temp = 0;

    Family() { }

    void setChild(String name,String surname,int year,int iq,int day,String task) {
        count++;
        Human child = new Human();
        child.setName(name);
        child.setSurname(surname);
        child.setIq(iq);
        child.setYear(year);
        child.setSchedule(day, task);
        addChild(child);
    }

    private void addChild(Human child) {
        children[temp] = child;
        temp++;
    }

    void deleteChild(int i) {
        if (temp + 1 - i >= 0) System.arraycopy(children, i + 1, children, i, temp + 1 - i);
        temp--;
        count--;
    }

     void setMother(String name,String surname,int year,int iq,int day,String task) {
        count++;
        mother = new Human();
        mother.setName(name);;
        mother.setSurname(surname);
        mother.setYear(year);
        mother.setIq(iq);
        mother.setSchedule(day, task);
    }

    void setFather(String name, String surname, int year, int iq, int day, String task) {
        count++;
        father = new Human();
        father.setName(name);
        father.setSurname(surname);
        father.setYear(year);
        father.setIq(iq);
        father.setSchedule(day, task);
    }

    void setPet(String nickname,String species,int age,int trickLevel,String [] habits) {
        pet = new Pet();
        pet.setNickname(nickname);
        pet.setSpecies(species);
        pet.setAge(age);
        pet.setTrickLevel(trickLevel);
        pet.setHabits(habits);
    }

    @Override
    public String toString() {
        return "Family has " + this.count + " persons:" + "\nfather " + this.father.toString() + "\nmother: " + this.mother.toString() + "\nchildren: " + this.showChild() + "\npet: " + pet.toString();
    }

    private StringBuilder showChild() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < temp; i++) {
            str.append(children[i].toString());
        }
        return str;
    }

    void eat() {
        System.out.println("I am eating");
    }

    void respond() {
        System.out.printf("Hello, owner. I am - [%s]. I miss you!\n", pet.getNickname());
    }

    void foul() {
        System.out.println("I need to cover it up\n");
    }


}
