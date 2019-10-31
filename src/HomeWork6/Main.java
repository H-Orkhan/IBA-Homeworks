package HomeWork6;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human father = new Human("Ruslan", "Hashimov", 1970, 115, 6, "Have a rest");
        Human mother = new Human("Aida", "Hashimova", 1970, 115, 7, "Have a rest");
        Family family = new Family(mother, father);
        Pet pet = new Pet(Species.DOG, "Rax", 5, 75, new String[]{"eat", "sleep", "play"});
        Human child = new Human("Orkhan", "Hashimov", 2000, 110, 1, "Go to university");
        family.addChild(child);
        family.addPet(pet);
        System.out.println(family.toString());

        family.eat();
        family.respond();
        family.foul();

        Pet pet1 = new Pet(Species.DOG, "Rax", 5, 75, new String[]{"eat", "sleep", "play"});
        Pet pet2 = new Pet(Species.DOG, "Rax", 5, 75, new String[]{"eat", "sleep", "play"});
        if (pet1.equals(pet2)) System.out.println("They are same");
        else System.out.println("They are different");

        for (int i = 0; i < 1000000; i++) {
            Human human = new Human();
        }
    }}