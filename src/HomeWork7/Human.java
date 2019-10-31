package HomeWork7;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule = new String[][]{
            {DayOfWeek.MONDAY.name(), " "}, {DayOfWeek.TUESDAY.name(), " "}, {DayOfWeek.WEDNESDAY.name(), " "},
            {DayOfWeek.THURSDAY.name(), " "}, {DayOfWeek.FRIDAY.name(), " "}, {DayOfWeek.SATURDAY.name(), " "},
            {DayOfWeek.SUNDAY.name(), " "}};

    public Human(String name, String surname, int year, int iq, String day, String task) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.year = year;
        this.setSchedule(day, task);
    }

    private String getSchedule() {
        for (int i = 0; i < 7; i++) {
            if (!schedule[i][1].equals(" ")) return schedule[i][0] + " " + schedule[i][1];
        }
        return "Something is wrong";
    }


    void setSchedule(String day, String Task) {
        for (int j = 0; j < 7; j++) {
            if (schedule[j][0].equals(day.toUpperCase())) schedule[j][1] = Task;
        }
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
