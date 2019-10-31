package HomeWork6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    Human  father = new Human ("Ruslan","Hashimov",1970,115,6,"Have a rest");
    Human  mother = new Human ("Aida","Hashimova",1970,115,7,"Have a rest");
    Human  child = new Human("Orkhan","Hashimov",2000,110,1,"Go to university");
    Human child2 = new Human ("Smb","Smb",2005,111,5,"Smth");
    Family family1 = new Family(mother,father);



    @Before
    public void setUp() throws Exception {
        family1.addChild(child);
        Pet pet = new Pet(Species.DOG,"Rax",5,75, new String[]{"eat", "sleep", "play"});
        family1.addPet(pet);
    }

    @Test
    public void testToStringMother() {
       String expect = "Human name = Aida surname = Hashimova year = 1970 iq = 115 schedule = SUNDAY Have a rest";
       String actual = mother.toString();
       assertEquals(expect,actual);
    }
    @Test
    public void testToStringFather() {
        String expect = "Human name = Ruslan surname = Hashimov year = 1970 iq = 115 schedule = SATURDAY Have a rest";
        String actual = father.toString();
        assertEquals(expect,actual);
    }

    @Test
    public void deleteChild() {
        family1.addChild(child2);
        family1.deleteChild(2);
        int expect = 1;
        int actual = family1.temp;
    }

    @Test
    public void deleteChild2() {
        family1.addChild(child2);
        family1.deleteChild(5);
        int expect = 2;
        int actual = family1.temp;
    }

    @Test
    public void checkCountFamily() {
        int expect = 3;
        int actual = family1.countFamily();
        assertEquals(expect,actual);
    }

    @Test
    public void checkAddChild() {
        family1.addChild(child2);
        int expect = 2;
        int actual = family1.temp;
        assertEquals(expect,actual);
    }

}