package HomeWork9;

import java.util.HashMap;

public class Human {
    private Family family;
    private String name;
    private String surname;
    private int year;
    private int iq;
    private HashMap<String, String> schedule = new HashMap<String, String>();
    public Human(String name, String surname, int year, int iq, String day, String task) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.year = year;
        this.setSchedule(day, task);
    }

    public Family getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Human(Family family, String boy) {
        this.family = family;

    }

    private String getSchedule() {
        return String.valueOf(schedule);
    }


    void setSchedule(String day, String Task) {
        schedule.put(day,Task);
    }


    void greetPet() {
    }


    @Override
    public String toString() {
        return "Name = " + this.name + " surname = " + this.surname + " year = " + this.year + " iq = " + this.iq + " schedule = " + this.getSchedule().toLowerCase();
    }

    @Override
    protected void finalize() {
        System.out.println("Object Has been deleted");
    }
}
