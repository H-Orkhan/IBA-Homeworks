package HomeWork9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FamilyServiceTest {

    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
    FamilyService familyService = new FamilyService();
    FamilyController familyController = new FamilyController();
    Man father1;
    Man father2;
    Woman mother1;
    Woman mother2;
    Human child1;
    Human child2;
    Pet dog;
    Pet cat;
    Pet catDomestic;
    Pet fish;
    @Before
    public void before () {
        this.father1 = new Man("fatherName1", "fatherSurname1", 1970, 115, "Monday", "Have a rest");
        this.mother1 = new Woman("motherName1", "motherSurname1", 1970, 115, "Tuesday", "Have a rest");
        this.father2 = new Man("fatherName2", "FatherSurname2", 1960, 115, "Day", "Task");
        this.mother2 = new Woman("MotherName2", "motherSurname", 1970, 115, "Tuesday", "Have a rest");
        this.child1 = new Human ("childName1","childSurname1",2005,115,"DayOfChild1","TaskOfChild1");
        this.child2 = new Human ("childName2","childSurname2",2007,119,"DayOfChild2","TaskOfChild2");
        this.dog = new Dog("Rax", 5, 75, "eat", "sleep", "play");
        this.cat = new RoboCat("Robo", 1, 110, "On", "Off", "Saying 0 and 1 instead 'meow'");
        this.catDomestic = new DomesticCat("Oreo", 5, 70, "eat", "sleep", "play");
        this.fish = new Fish("Fish", 1, 10, "Swim", "eat", "sleep");
    }
    @Test
    public void getAllFamilies() {
        familyController.createNewFamily(mother1,father1);
        familyController.addPet(0,dog);
        String expect = "[\n" +
                "Family has 2 persons:\n" +
                "father Name = fatherName1 surname = fatherSurname1 year = 1970 iq = 115 schedule = {monday=have a rest}\n" +
                "mother: Name = motherName1 surname = motherSurname1 year = 1970 iq = 115 schedule = {tuesday=have a rest}\n" +
                "children: []\n" +
                "pet: [Dog nickname = Rax age = 5 trickLevel = 75 habits = [sleep, play, eat]]]";
        String actual = familyController.getAllFamilies().toString();
        assertEquals(expect,actual);
    }

    @Test
    public void displayAllFamilies() {
        familyController.createNewFamily(mother1,father1);
        familyController.addPet(0,dog);
        String expect = "[\n" +
                "Family has 2 persons:\n" +
                "father Name = fatherName1 surname = fatherSurname1 year = 1970 iq = 115 schedule = {monday=have a rest}\n" +
                "mother: Name = motherName1 surname = motherSurname1 year = 1970 iq = 115 schedule = {tuesday=have a rest}\n" +
                "children: []\n" +
                "pet: [Dog nickname = Rax age = 5 trickLevel = 75 habits = [sleep, play, eat]]]";
        String actual = familyController.displayAllFamilies();
        assertEquals(expect,actual);
    }

    @Test
    public void getFamiliesBiggerThan() {
        familyController.createNewFamily(mother1,father1);
        familyController.bornChild(familyController.getFamilyById(0),"Name1","Name2");
        familyController.createNewFamily(mother2,father2);
        int expect = 1;
        int actual = familyController.getFamiliesBiggerThan(2);

    }

    @Test
    public void getFamiliesLessThan() {
        familyController.createNewFamily(mother1,father1);
        familyController.bornChild(familyController.getFamilyById(0),"Name1","Name2");
        familyController.createNewFamily(mother2,father2);
        int expect = 1;
        int actual = familyController.getFamiliesLessThan(2);

    }

    @Test
    public void countFamiliesWithMemberNumber() {
        familyController.createNewFamily(mother1,father1);
        int count = 2;
        int expect = 1;
        int actual = familyController.countFamiliesWithMemberNumber(count);
        assertEquals(expect,actual);

    }

    @Test
    public void createNewFamily() {
        familyController.createNewFamily(mother1,father1);
        int expect = 1;
        int actual =familyController.getAllFamilies().size();
        assertEquals(expect,actual);
    }

    @Test
    public void deleteFamilyByIndex() {
        familyController.createNewFamily(mother1,father1);
        familyController.deleteFamilyByIndex(0);
        assertEquals(0,familyController.getAllFamilies().size());
    }

    @Test
    public void bornChild() {
        familyController.createNewFamily(mother1,father1);
        familyController.bornChild(familyController.getFamilyById(0),"Name1","Name2");
        int expect = 3;
        int actual = familyController.getFamilyById(0).countFamily();
        assertEquals(expect,actual);
    }

    @Test
    public void adoptChild() {
        familyController.createNewFamily(mother1,father1);
        familyController.adoptChild(familyController.getFamilyById(0),child1);
        int expect = 3;
        int actual = familyController.getFamilyById(0).countFamily();
        assertEquals(expect,actual);
    }

    @Test
    public void count() {
        familyController.createNewFamily(mother1,father1);
        familyController.createNewFamily(mother2,father2);

        int expect = 2;
        int actual = familyController.count();
        assertEquals(expect,actual);
    }

    @Test
    public void getFamilyById() {
        familyController.createNewFamily(mother1,father1);

        String expect =
                "\nFamily has 2 persons:\n" +
                        "father Name = fatherName1 surname = fatherSurname1 year = 1970 iq = 115 schedule = {monday=have a rest}\n" +
                        "mother: Name = motherName1 surname = motherSurname1 year = 1970 iq = 115 schedule = {tuesday=have a rest}\n" +
                        "children: []\n" +
                        "pet: []";
        String actual =familyController.getFamilyById(0).toString();
        assertEquals(expect,actual);

    }

    @Test
    public void getPets() {
        familyController.createNewFamily(mother1,father1);
        familyController.addPet(0,dog);
        String actual = familyController.getPets(0).toString();
        String expect = "[Dog nickname = Rax age = 5 trickLevel = 75 habits = [sleep, play, eat]]";
        assertEquals(actual,expect);

    }

    @Test
    public void addPet() {
        familyController.createNewFamily(mother1,father1);

        boolean expect = true;
        boolean actual = familyController.addPet(0,dog);
    }
}