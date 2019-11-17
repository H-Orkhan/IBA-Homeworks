package HomeWork10;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;

public class FamilyController {
    private FamilyService familyService = new FamilyService();

    List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    String displayAllFamilies() {
      return familyService.displayAllFamilies();
    }

    int getFamiliesBiggerThan(int count) {
        return familyService.getFamiliesBiggerThan(count);
    }

    int getFamiliesLessThan(int count) {
        return familyService.getFamiliesLessThan(count);
    }

    int countFamiliesWithMemberNumber(int count) {return  familyService.countFamiliesWithMemberNumber(count); }

    boolean createNewFamily(Human obj1, Human obj2) { return familyService.createNewFamily(obj1, obj2);}

    void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    void bornChild(Family family, String nameBoy, String nameGirl) throws ParseException { familyService.bornChild(family, nameBoy, nameGirl); }

    void adoptChild(Family family, Human child) {
        familyService.adoptChild(family, child);
    }

    public int count() {
        return familyService.count();
    }

    Family getFamilyById(int ID) {
        return familyService.collectionFamilyDao.getFamilyByIndex(ID);
    }

    HashSet<Pet> getPets(int ID) {
        return familyService.getPets(ID);
    }

    boolean deleteFamily(Family family) { return familyService.deleteFamily(family); }
    public boolean addPet(int ID, Pet pet) {
        return familyService.addPet(ID, pet);
    }
}
