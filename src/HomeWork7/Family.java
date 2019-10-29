package HomeWork7;

public class Family {
    Woman mother;
    Man father;
    private Human[] children = new Human[10];
    private Pet pet;
    private int count = 0;
    private static int temp = 0;

    Family() { }

    void setPet(Pet pet) {
        this.pet = pet;
    }

    void setChild(String name,String surname,int year,int iq,String day,String task) {
        count++;
        Human child = new Human();
        child.setName(name);
        child.setSurname(surname);
        child.setIq(iq);
        child.setYear(year);
        child.setSchedule(day.toUpperCase(), task);
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

    void setMother(String name, String surname, int year, int iq, String day, String task) {
        count++;
        mother = new Woman();
        mother.setName(name);
        mother.setSurname(surname);
        mother.setYear(year);
        mother.setIq(iq);
        mother.setSchedule(day.toUpperCase(), task);
    }

    void setFather(String name, String surname, int year, int iq, String day, String task) {
        count++;
        father = new Man();
        father.setName(name);
        father.setSurname(surname);
        father.setYear(year);
        father.setIq(iq);
        father.setSchedule(day.toUpperCase(),task);
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

    @Override
    protected void finalize() {
        System.out.println("Object " + this.getClass().getName());
    }

}
