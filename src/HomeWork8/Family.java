package HomeWork8;
import java.util.ArrayList;
import java.util.HashSet;

public class Family {
    private Woman mother;
    private Man father;
    private ArrayList<Human> children = new ArrayList<>();
    private HashSet<Pet> pets = new HashSet<>();
    private int count = 0;
    Family() {
        setMother();
        setFather();
    }
    void setPet(Pet pet) {
        pets.add(pet);
    }

    void setChild() {
        count++;
        Human child = new Human();
        child.setName("Orkhan");
        child.setSurname("Hashimov");
        child.setIq(115);
        child.setYear(2000);
        child.setSchedule(DayOfWeek.MONDAY,"Go to university");
        children.add(child);
    }

    void deleteChild(int i) {
        count--;
        children.remove(i);
    }

    private void setMother() {
        count++;
        mother = new Woman();
        mother.setName("Aida");
        mother.setSurname("Hashimova");
        mother.setYear(1970);
        mother.setIq(110);
        mother.setSchedule(DayOfWeek.SUNDAY,"Have a rest");
        mother.makeUp();

    }

    private void setFather() {
        count++;
        father = new Man();
        father.setName("Ruslan");
        father.setSurname("Hashimov");
        father.setYear(1970);
        father.setIq(110);
        father.setSchedule(DayOfWeek.SATURDAY,"Go to football");
        father.repairCar();
    }

    @Override
    public String toString()
    {
        return "Family has " + this.count+ " persons:" +"\nfather " + this.father.toString() + "\nmother: " + this.mother.toString() + "\nchildren: "+this.children.toString() +"\npet: " + pets.toString();
    }

    @Override
    protected void finalize() {
        System.out.println("Object "+this.getClass().getName());
    }

}
