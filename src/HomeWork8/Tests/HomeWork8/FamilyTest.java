package HomeWork8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    Man father = new Man ("Ruslan","Hashimov",1970,115,"saturday","Have a rest");
    Woman mother = new Woman ("Aida","Hashimova",1970,115,"sunday","Have a rest");
    Man child = new Man("Orkhan","Hashimov",2000,110,"monday","Go to university");
    Woman child2 = new Woman ("Smb","Smb",2005,111,"friday","Smth");
    Family family1 = new Family(mother,father);



    @Before
    public void setUp() throws Exception {
        family1.addChild(child);
        Dog dog = new Dog("Rax",5,75, "eat", "sleep", "play");
        family1.addPet(dog);
    }

    @Test
    public void testToStringMother() {
        String expect = "Name = Aida surname = Hashimova year = 1970 iq = 115 schedule = {sunday=have a rest}";
        String actual = mother.toString();
        assertEquals(expect,actual);
    }
    @Test
    public void testToStringFather() {
        String expect = "Name = Ruslan surname = Hashimov year = 1970 iq = 115 schedule = {saturday=have a rest}";
        String actual = father.toString();
        assertEquals(expect,actual);
    }

    @Test
    public void deleteChild() {
        family1.addChild(child2);
        family1.deleteChild(child2);
        int expect = 1;
        int actual = family1.children.size();
        assertEquals(expect,actual);
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
        int actual = family1.children.size();
        assertEquals(expect,actual);
    }

}