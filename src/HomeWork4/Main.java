package HomeWork4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pet class:");
        Pet dog = new Pet("Dog", "John", 8, 75);
        System.out.println(dog.toString());

        Pet cat = new Pet("Cat", "Bill");

        cat.age = 5;
        cat.trickLevel = 71;
        System.out.println(cat.toString());

        System.out.println("\nHuman class:");
        Human father = new Human("Ruslan", "Hashimov");
        Human mother = new Human("Aida", "Hashimova");
        Human man = new Human("Orkhan", "Hashimov", 2000, 110, dog, mother, father);

        System.out.println(father.toString(2));

        System.out.println(mother.toString(1));

        System.out.println(man.toString());

        man.greetPet();
        man.describePet();
    }
}