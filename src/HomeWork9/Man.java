package HomeWork9;

final class Man extends Human {
    Man(String name, String surname, int year, int iq, String day, String task) {
        super(name, surname, year, iq, day, task);
    }


    void greetPet() {
        System.out.println("GreetPet method from Man Class");
    }

    void repairCar() {
        System.out.println("Father repair the car");
    }
}
