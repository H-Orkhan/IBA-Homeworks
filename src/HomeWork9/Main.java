package HomeWork9;

public class Main {
    public static void main(String[] args) {
        FamilyController familyController = new FamilyController();

        Pet dog = new Dog("Rax", 5, 75, "eat", "sleep", "play");
        Pet catDomestic = new DomesticCat("Oreo", 5, 70, "eat", "sleep", "play");

        /*Creating Family Number 1*/

        Man father1 = new Man("fatherName1", "fatherSurname1", 1970, 115, "Monday", "Have a rest");
        Woman mother1 = new Woman("motherName1", "motherSurname1", 1970, 115, "Tuesday", "Have a rest");
        Human child1 = new Human("AdoptedName1","AdoptedSurname1",2010,120,"Friday","Go to Course");
        familyController.createNewFamily(mother1,father1);

        familyController.addPet(0,dog);
        familyController.bornChild(familyController.getFamilyById(0),"Boy","Girl");

        familyController.adoptChild(familyController.getFamilyById(0),child1);
        familyController.getPets(0);

        String str = familyController.getFamilyById(0).toString();
        System.out.println(str);
        /*Creating Family Number2 */

        Man father2 = new Man("fatherName2", "fatherSurname2", 1960, 125, "Wednesday", "Go to store");
        Woman mother2 = new Woman("motherName2", "motherSurname2", 1965, 115, "Thursday", "Go to work");
        Human child2 = new Human("AdoptedName2","AdoptedSurname2",2010,120,"Friday","Go to Course");
        familyController.createNewFamily(mother2,father2);
        familyController.addPet(1,catDomestic);
        familyController.bornChild(familyController.getFamilyById(1),"BoyName","GirlName");
        familyController.adoptChild(familyController.getFamilyById(1),child2);
        familyController.getPets(1);

         System.out.println("getFamiliesLessThan(2) = " + familyController.getFamiliesLessThan(2));
         System.out.println("getFamiliesBiggerThan(2) = "+familyController.getFamiliesBiggerThan(2));

        System.out.println(familyController.getAllFamilies());

        familyController.deleteFamilyByIndex(1);
        System.out.println("There are :" + familyController.count()+ " families");

        familyController.deleteFamily(familyController.getFamilyById(0));
        System.out.println("There are :" + familyController.count()+ " families");
    }
}
