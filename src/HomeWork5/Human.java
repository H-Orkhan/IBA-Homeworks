package HomeWork5;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String [][]schedule = new String [7][2];

    Human() { }

    private String getSchedule() {
        for (int i = 0; i <7 ; i++) {
            if (schedule[i][1] != null && !(schedule[i][1].equals("null"))) {
                return schedule[i][0] + " " + schedule[i][1];
            } }
        return null;
    }
    
    void setSchedule(int i, String Task) {
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";
        schedule[i-1][1] = Task;
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
   public String toString ()
   {
       return "Human name = "+this.name+ " surname = "+this.surname+" year = "+this.year+" iq = "+this.iq + " schedule = "+this.getSchedule();
   }
}
