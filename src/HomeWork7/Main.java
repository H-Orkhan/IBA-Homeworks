package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Rax", 5, 75, "eat", "sleep", "play");
        Pet cat = new RoboCat("Robo", 1, 110, "On", "Off", "Saying 0 and 1 instead 'meow'");
        Pet catDomestic = new DomesticCat("Oreo", 5, 70, "eat", "sleep", "play");
        Pet fish = new Fish("Fish", 1, 10, "Swim", "eat", "sleep");
        Family family = new Family();

        family.setFather("Ruslan","Hashimov",1970,115,"Monday","Have a rest");
        family.setMother("Aida","Hashimova",1970,115,"Tuesday","Have a rest");
        family.setChild("Orkhan","Hashimov",2000,110,"Wednesday","Go to university");
        family.setChild("Somebody","Somebody",2005,150,"Friday","Have a rest");
        family.setPet(catDomestic);
        family.deleteChild(1);
        System.out.println(family.toString());
        family.mother.makeUp();
        family.father.repairCar();

        //There is finalize method from hmw6
       /* for (int i = 0; i <1000000 ; i++) {
            Human human = new Human();
            
        }*/


    }
}
