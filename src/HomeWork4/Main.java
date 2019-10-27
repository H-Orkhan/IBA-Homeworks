package HomeWork4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pet class:");
        Pet dog = new Pet("Dog", "John", 8, 75);
        dog.toString(dog);
        System.out.println();
        Pet cat = new Pet("Cat", "Bill");

        cat.age = 5;
        cat.trickLevel = 71;
        cat.toString(cat);

        System.out.println("\nHuman class:");
        Human father = new Human("Ruslan", "Hashimov");
        Human mother = new Human("Aida", "Hashimova");
        Human man = new Human("Orkhan", "Hashimov", 2000, 110, dog, mother, father);

        man.toString(dog);
        man.greetPet();
        man.describePet();
        System.out.println();
    }
}
