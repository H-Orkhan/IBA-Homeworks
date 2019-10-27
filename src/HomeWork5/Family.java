package HomeWork5;
 public class Family {
   private Human mother;
   private Human father;
   private Human [] children = new Human [10];
   private Pet pet;
   private int count = 0;
   private static int temp = 0;

     Family() {
         setMother();
         setFather();
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
        mother = new Human ();
        mother.setName("Aida");
        mother.setSurname("Hashimova");
        mother.setYear(1970);
        mother.setIq(110);
        mother.setSchedule(7,"Have a rest");
    }

    private void setFather() {
        count++;
        father = new Human ();
        father.setName("Ruslan");
        father.setSurname("Hashimov");
        father.setYear(1970);
        father.setIq(110);
        father.setSchedule(6,"Go to football");
    }

    void setPet(){
         pet = new Pet();
         pet.setNickname("John");
         pet.setSpecies("Dog");
         pet.setAge(5);
         pet.setTrickLevel(75);
         pet.setHabits("play","eat","sleep");
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

     void eat()
     {
         System.out.println("I am eating");
     }
     void respond()
     {
         System.out.printf("Hello, owner. I am - [%s]. I miss you!\n",pet.getNickname());
     }
     void foul()
     {
         System.out.println("I need to cover it up\n");
     }


}
