package HomeWork8;

import java.util.ArrayList;
import java.util.HashSet;

public class Family{
    public int countFamily;
    public int temp;
    protected Woman mother;
    protected Man father;
    protected ArrayList<Human> children = new ArrayList<>();
    private HashSet<Pet> pet = new HashSet<>();
    private int count = 0;


    Family(Woman mother,Man father) {
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    void addChild(Human child) {
        count++;
        children.add(child);
    }

    void deleteChild(Human i) {
        children.remove(i);
        count--;
    }

    @Override
    public String toString() {
        return "Family has " + this.count + " persons:" + "\nfather " + this.father.toString() + "\nmother: " + this.mother.toString() + "\nchildren: " + this.children.toString() + "\npet: " + pet.toString();
    }

    public void addPet(Pet pet) {
        this.pet.add(pet);
    }
    @Override
    protected void finalize() {
        System.out.println("Object "+this.getClass().getName());
    }

    public int countFamily() {
        return count;
    }
}
