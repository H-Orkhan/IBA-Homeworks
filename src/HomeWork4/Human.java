package HomeWork4;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    static String[][] schedule = new String[7][2];

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        generateSchedule();
    }

    private void generateSchedule() {
        {
            schedule[0][0] = "Sunday";
            schedule[0][1] = "do home work";
            schedule[1][0] = "Monday";
            schedule[1][1] = "go to courses; watch a film";
            schedule[2][0] = "Tuesday";
            schedule[2][1] = "go to university; have a rest";
            schedule[3][0] = "Wednesday";
            schedule[3][1] = "go to courses;listen music";
            schedule[4][0] = "Thursday";
            schedule[4][1] = "go to university; have a rest";
            schedule[5][0] = "Friday";
            schedule[5][1] = "go to courses;read a book";
            schedule[6][0] = "Saturday";
            schedule[6][1] = "have a rest; watch TV;play Playstation";
        }
    }

    public void greetPet() {
        System.out.printf("\nHello, [%s]", this.pet.nickname);
    }

    public String trickLevel(Pet pet) {
        if (this.pet.trickLevel > 50) return "very sly]";
        else return "almost not sly]";
    }

    public void describePet() {
        System.out.println("\nI have a [" + this.pet.species + "] he is [" + this.pet.age + "] years old, he is [" + trickLevel(this.pet));
    }

    public void toString(Pet pet) {
        System.out.print("Human{name= '" + this.name + "', surname= " + this.surname + ",year=" + this.year + ",iq= " + this.iq + ",mother= " + this.mother.name + " " + this.mother.surname + ",father= " + this.father.name + " " + this.father.surname + "\npet= ");
        this.pet.toString(pet);
        System.out.println("\nYour Schedule: ");
        showSchedule();

    }

    private void showSchedule() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(schedule[i][j] + ": ");
            }
            System.out.println();
        }
    }
}
