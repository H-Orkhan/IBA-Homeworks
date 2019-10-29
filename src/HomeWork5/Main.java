package HomeWork5;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        family.setPet("Rax","Dog",5,75, new String[]{"eat", "sleep", "play"});
        family.setFather("Ruslan","Hashimov",1970,115,6,"Have a rest");
        family.setMother("Aida","Hashimova",1970,115,7,"Have a rest");
        family.setChild("Orkhan","Hashimov",2000,110,1,"Go to university");
        family.setChild("Somebody","Somebody",2005,150,3,"Have a rest");
        family.deleteChild(1);
        System.out.println(family.toString());

        family.eat();
        family.respond();
        family.foul();

        Pet dog = new Pet();
        dog.setSpecies("Dog");
        dog.setNickname("Rax");
        dog.setAge(5);
        Pet cat = new Pet();
        cat.setSpecies("Cat");
        cat.setNickname("Oreo");
        cat.setAge(5);
        Pet dog2 = new Pet();
        dog2.setSpecies("Dog");
        dog2.setNickname("Rax");
        dog2.setAge(5);

        if (dog.equals(cat)) System.out.println("They are equal");
        else System.out.println("They are not equal");

        if (dog.equals(dog2)) System.out.println("They are equal");
        else System.out.println("They are not equal");

    }
}
