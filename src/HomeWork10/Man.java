package HomeWork10;

import java.text.ParseException;

final class Man extends Human {
    Man(String name, String surname, String year, int iq, String day, String task) throws ParseException {
        super(name, surname, year, iq, day, task);
    }


    void greetPet() {
        System.out.println("GreetPet method from Man Class");
    }

    void repairCar() {
        System.out.println("Father repair the car");
    }
}
