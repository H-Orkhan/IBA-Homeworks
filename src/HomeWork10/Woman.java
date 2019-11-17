package HomeWork10;

import java.text.ParseException;

final class Woman extends Human {
    Woman(String name,String surname,String  year,int iq,String day,String task) throws ParseException {
        super(name,surname,year,iq,day,task);
    }

    void greetPet() {
        System.out.println("GreetPet method from Woman Class");
    }

    void makeUp() {
        System.out.println("Mother has MakeUp");
    }
}
