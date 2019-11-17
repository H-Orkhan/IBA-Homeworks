package HomeWork10;

import java.util.ArrayList;
import java.util.HashSet;

public class Family {
    public int temp;
    protected Human mother;
    protected Human father;
    private ArrayList<Human> children = new ArrayList<>();
    private HashSet<Pet> pet = new HashSet<>();
    private int count = 0;

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }


    public Family(Human obj1, Human obj2) {
        count = 2;
        this.mother = (Woman) obj1;
        this.father = (Man) obj2;
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
        return  "\nFamily has " + this.count +
                " persons:" + "\nfather " + this.father.toString() + "\nmother: " + this.mother.toString() +
                "\nchildren: " + this.children.toString() + "\npet: " + pet.toString();
    }

    HashSet<Pet> showPets() {
        return this.pet;
    }

    public boolean addPet(Pet pet) {
        return this.pet.add(pet);
    }

    @Override
    protected void finalize() {
        System.out.println("Object " + this.getClass().getName());
    }

    int countFamily() {
        return count;
    }
}
