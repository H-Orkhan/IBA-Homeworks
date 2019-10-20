package HomeWork4;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    static String [][] scedule = new String [7][2];

    public Human () {}

    public Human(String name,String surname) {
        this.name = name;
        this.surname=surname;
    }

    public Human(String name, String surname, int year, int iq, Pet pet,Human mother,Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        generateScedule();
    }

    private void generateScedule() {{
            scedule[0][0] = "Sunday";
            scedule[0][1] = "do home work";
            scedule[1][0] = "Monday";
            scedule[1][1] = "go to courses; watch a film";
            scedule[2][0] = "Tuesday";
            scedule[2][1] = "go to university; have a rest";
            scedule[3][0] = "Wednesday";
            scedule[3][1] = "go to courses;listen music";
            scedule[4][0] = "Thursday";
            scedule[4][1] = "go to university; have a rest";
            scedule[5][0] = "Friday";
            scedule[5][1] = "go to courses;read a book";
            scedule[6][0] = "Saturday";
            scedule[6][1] = "have a rest; watch TV;play Playstation";
        }}

    public void greetPet()
    {
        System.out.printf("\nHello, [%s]",this.pet.nickname);
    }
    public String trickLevel (Pet pet)
    {
        if (this.pet.trickLevel>50) return "very sly]";
        else return "almost not sly]";
    }
    public void describePet()
    {
        System.out.println("\nI have a [" + this.pet.species + "] he is [" + this.pet.age + "] years old, he is ["+ trickLevel(this.pet));
    }
    public void toString (Pet pet)
    {
        System.out.print("Human{name= '" + this.name+ "', surname= " +this.surname+",year=" +this.year+ ",iq= " + this.iq + ",mother= " + this.mother.name + " " + this.mother.surname +",father= " + this.father.name + " " + this.father.surname +"\npet= ");
        this.pet.toString(pet);
        System.out.println("\nYour Scedule: ");
        showScedule();

    }

    private void showScedule() {
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(scedule[i][j] + ": ");
            }
            System.out.println();
        }
    }
}
