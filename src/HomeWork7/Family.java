package HomeWork7;

public class Family {
    private Woman mother;
    private Man father;
    private Human[] children = new Human[10];
    private Pet pet;
    private int count = 0;
    private static int temp = 0;
    Family() {
        setMother();
        setFather();
    }
    void setPet(Pet pet) {
        this.pet = pet;
    }

    void setChild() {
        count++;
        Human child = new Human();
        child.setName("Orkhan");
        child.setSurname("Hashimov");
        child.setIq(115);
        child.setYear(2000);
        child.setSchedule(1,"Go to university");
        addChild(child);
    }

    private void addChild(Human child) {
        children[temp] = child;
        temp++;
    }
    void deleteChild(int i)
    {
        if (temp + 1 - i >= 0) System.arraycopy(children, i + 1, children, i, temp + 1 - i);
        temp--;
        count--;
    }

    private void setMother() {
        count++;
        mother = new Woman();
        mother.setName("Aida");
        mother.setSurname("Hashimova");
        mother.setYear(1970);
        mother.setIq(110);
        mother.setSchedule(7,"Have a rest");
        mother.makeUp();

    }

    private void setFather() {
        count++;
        father = new Man();
        father.setName("Ruslan");
        father.setSurname("Hashimov");
        father.setYear(1970);
        father.setIq(110);
        father.setSchedule(6,"Go to football");
        father.repairCar();
    }

    @Override
    public String toString()
    {
        return "Family has " + this.count+ " persons:" +"\nfather " + this.father.toString() + "\nmother: " + this.mother.toString() + "\nchildren: "+this.showChild() +"\npet: " + pet.toString();
    }

    private StringBuilder showChild() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <temp ; i++) {
            str.append(children[i].toString());
        }
        return str;
    }
    @Override
    protected void finalize() {
        System.out.println("Object "+this.getClass().getName());
    }

}
