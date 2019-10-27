package HomeWork7;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule = new String[7][2];
    private DayOfWeek[] day = DayOfWeek.values();

    Human() {
    }

    private String getSchedule() {
        for (int i = 0; i < 7; i++) {
            if (schedule[i][1] != null && !(schedule[i][1].equals("null"))) {
                return schedule[i][0] + " " + schedule[i][1];
            }
        }
        return null;
    }

    void setSchedule(int i, String Task) {
        for (int j = 0; j < 7; j++) {
            schedule[j][0] = String.valueOf(day[j]);
        }
        schedule[i - 1][1] = Task;
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
