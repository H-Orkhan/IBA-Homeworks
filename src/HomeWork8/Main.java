package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Rax", 5, 75, "eat","sleep","play");
        Pet cat = new RoboCat("Robo", 1, 110, "On", "Off", "Saying 0 and 1 instead 'meow'");
        Pet catDomestic = new DomesticCat("Oreo", 5, 70, "eat", "sleep", "play");
        Pet fish = new Fish("Fish", 1, 10, "Swim", "eat", "sleep");
        Man father = new Man("Ruslan", "Hashimov", 1970, 115, "Monday", "Have a rest");
        Woman mother = new Woman("Aida", "Hashimova", 1970, 115, "Tuesday", "Have a rest");
        Family family = new Family(mother, father);
        Man child = new Man("Orkhan", "Hashimov", 2000, 110, "Wednesday", "Go to university");
        family.addChild(child);
        Man child2 = new Man("Somebody", "Somebody", 2005, 150, "Friday", "Have a rest");
        family.addChild(child2);
        family.addPet(catDomestic);
        System.out.println(family.toString());
        family.mother.makeUp();
        family.father.repairCar();
    }
}
