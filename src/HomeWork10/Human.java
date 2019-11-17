package HomeWork10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Human {
    private Family family;
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private HashMap<String, String> schedule = new HashMap<String, String>();

    public Human(String name, String surname, String date, int iq, String day, String task) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(date).getTime();
        this.setSchedule(day, task);
    }


    void describeAge() {
        Calendar time = Calendar.getInstance();
        long difference= time.getTimeInMillis() - this.birthDate;
        time.setTimeInMillis(difference);
        int year = time.get(Calendar.YEAR) - 1970;
        int month = time.get(Calendar.MONTH);
        int day = time.get(Calendar.DAY_OF_MONTH) - 1;
        System.out.println(year + " years " + month + " months " + day + " days ");
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

    public String birthdayToString () {
                Date date=new Date(birthDate);
                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                return df2.format(date);
            }

    @Override
    public String toString() {
        return "Name = " + this.name + " surname = " + this.surname + " year = " + this.birthdayToString() + " iq = " + this.iq + " schedule = " + this.getSchedule().toLowerCase();
    }

    @Override
    protected void finalize() {
        System.out.println("Object Has been deleted");
    }
}
