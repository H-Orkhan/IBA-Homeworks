package HomeWork5;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule = new String[][] {{"Monday"," "},{"Tuesday", " "},{"Wednesday", " "},{"Thursday", " "},
            {"Friday", " "}, {"Saturday", " " } , {"Sunday", " "}};
    Human() {
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


    @Override
    public String toString() {
        return "Human name = " + this.name + " surname = " + this.surname + " year = " + this.year + " iq = " + this.iq + " schedule = " + this.getSchedule();
    }
}
