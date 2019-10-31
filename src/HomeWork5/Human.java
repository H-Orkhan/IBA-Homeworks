package HomeWork5;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule = new String[][] {{"Monday"," "},{"Tuesday", " "},{"Wednesday", " "},{"Thursday", " "},
            {"Friday", " "}, {"Saturday", " " } , {"Sunday", " "}};


    public Human(String name, String surname, int year, int iq, int day, String task) {
        this.name= name;
        this.surname = surname;
        this.iq= iq;
        this.year=year;
        this.setSchedule(day,task);
    }

    private String getSchedule() {
        for (String[] strings : schedule) {
            if (!strings[1].equals(" ")) {
                return strings[0] + " " + strings[1];
            }
        }
        return "Something is wrong";
    }
    void setSchedule(int day, String Task) {
        schedule[day - 1][1] = Task;
    }

    @Override
    public String toString() {
        return "Human name = " + this.name + " surname = " + this.surname + " year = " + this.year + " iq = " + this.iq + " schedule = " + this.getSchedule();
    }
}
