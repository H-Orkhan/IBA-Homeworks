package HomeWork9;

import java.util.HashSet;
import java.util.List;

public class FamilyController {
    FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public String displayAllFamilies() {
      return familyService.displayAllFamilies();
    }

    public int getFamiliesBiggerThan(int count) {
        return familyService.getFamiliesBiggerThan(count);
    }

    public int getFamiliesLessThan(int count) {
        return familyService.getFamiliesLessThan(count);
    }

    public int countFamiliesWithMemberNumber(int count) {return  familyService.countFamiliesWithMemberNumber(count); }

    public boolean createNewFamily(Human obj1, Human obj2) { return familyService.createNewFamily(obj1, obj2);}

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public void bornChild(Family family, String nameBoy, String nameGirl) { familyService.bornChild(family, nameBoy, nameGirl); }

    public void adoptChild(Family family, Human child) {
        familyService.adoptChild(family, child);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int ID) {
        return familyService.collectionFamilyDao.getFamilyByIndex(ID);
    }

    public HashSet<Pet> getPets(int ID) {
        return familyService.getPets(ID);
    }

    public boolean deleteFamily (Family family) { return familyService.deleteFamily(family); }
    public boolean addPet(int ID, Pet pet) {
        return familyService.addPet(ID, pet);
    }
}
