package HomeWork7;

public class Family {
    Woman mother;
    Man father;
    private Human[] children = new Human[10];
    private Pet pet;
    private int count = 0;
    private static int temp = 0;

    Family(Man father,Woman mother) {
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    void setPet(Pet pet) {
        this.pet = pet;
    }



    void addChild(Human child) {
        count++;
        children[temp] = child;
        temp++;
    }

    void deleteChild(int i) {
        if (temp + 1 - i >= 0) System.arraycopy(children, i + 1, children, i, temp + 1 - i);
        temp--;
        count--;
    }


    @Override
    public String toString() {
        return "Family has " + this.count + " persons:" + "\nfather " + this.father.toString() + "\nmother: " + this.mother.toString() + "\nchildren "+this.showChild() + "\npet:"+this.pet.toString();
    }

    private StringBuilder showChild() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < temp; i++) {
            str.append(children[i].toString() + " \n");
        }
        return str;
    }

    @Override
    protected void finalize() {
        System.out.println("Object " + this.getClass().getName());
    }

}
