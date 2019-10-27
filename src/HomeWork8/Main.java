package HomeWork8;


public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Rax", 5, 75, "eat", "sleep", "play");
        Pet cat = new RoboCat("Robo", 1, 110, "On", "Off", "Saying 0 and 1 instead 'meow'");
        Pet catDomestic = new DomesticCat("Oreo", 5, 70, "eat", "sleep", "play");
        Pet fish = new Fish("Fish", 1, 10, "Swim", "eat", "sleep");
        Family family = new Family();
        family.setPet(catDomestic);
        family.setPet(fish);
        family.setChild();
        family.setChild();
        family.deleteChild(1);
        System.out.println(family.toString());

        //There is finalize method from hmw6
       /* for (int i = 0; i <1000000 ; i++) {
            Human human = new Human();
            
        }*/


    }
}
