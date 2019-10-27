package HomeWork8;

import java.util.HashMap;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private HashMap<DayOfWeek, String> schedule = new HashMap<>();

    Human() {
    }

    private String getSchedule() {
        return String.valueOf(schedule);
    }

    void setSchedule(DayOfWeek day, String Task) {
        schedule.put(day, Task);
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setIq(int iq) {
        this.iq = iq;
    }

    void greetPet() {
    }


    @Override
    public String toString() {
        return "Human name = " + this.name + " surname = " + this.surname + " year = " + this.year + " iq = " + this.iq + " schedule = " + this.getSchedule();
    }

    @Override
    protected void finalize() {
        System.out.println("Object Has been deleted");
    }
}
