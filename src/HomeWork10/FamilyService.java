package HomeWork10;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class FamilyService {
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
    int index = 1;

    List<Family> getAllFamilies() {
        return collectionFamilyDao.getAllFamilies();
    }

    String displayAllFamilies() {
        System.out.println(collectionFamilyDao.getAllFamilies().toString());
        return  collectionFamilyDao.getAllFamilies().toString();
    }

    int getFamiliesBiggerThan(int count) {
        int temp = 0;
        for (int i = 0; i < collectionFamilyDao.getAllFamilies().size(); i++) {
            if (count < collectionFamilyDao.getFamilyByIndex(i).countFamily()){
                temp ++;
        } }
            return temp;
    }

    int getFamiliesLessThan(int count) {
        int temp = 0;
        for (int i = 0; i < collectionFamilyDao.getAllFamilies().size(); i++) {
            if (count > collectionFamilyDao.getFamilyByIndex(i).countFamily()){
                temp++;
        }
    }
        return temp;
    }


    int countFamiliesWithMemberNumber(int count) {
        int temp = 0;
        for (int i = 0; i < collectionFamilyDao.getAllFamilies().size(); i++) {
            if (count == collectionFamilyDao.getFamilyByIndex(i).countFamily()) {
                temp++;
                System.out.println(collectionFamilyDao.getFamilyByIndex(i));
            }
        }
        return temp;
    }


    boolean createNewFamily(Human obj1, Human obj2) {
        Family newFamily = new Family(obj1, obj2);
        return collectionFamilyDao.saveFamily(newFamily);
    }

    boolean deleteFamilyByIndex(int index) {
        return collectionFamilyDao.deleteFamily(index);
    }
    boolean deleteFamily(Family family) {return collectionFamilyDao.deleteFamily(family);}


    void bornChild(Family family, String boyName, String girlName) throws ParseException {
        int iq = 115;
        String year = "15/09/2000";
        boolean Boy = new Random().nextBoolean();
        if (Boy) {
            Human boy = new Human(boyName,family.getFather().getSurname(),year,iq,"Sunday","Have a rest");
            family.addChild(boy);
        } else {
            Human girl = new Human(girlName,family.getFather().getSurname(),year,iq,"Sunday","Have a rest");
            family.addChild(girl);
        }
    }

    void adoptChild(Family family, Human human) {
        family.addChild(human);
        collectionFamilyDao.updateFamily(family);
    }


    public int count() {
        return collectionFamilyDao.getAllFamilies().size();
    }




    HashSet<Pet> getPets(int index) { return collectionFamilyDao.getFamilyByIndex(index).showPets(); }

    public boolean addPet(int index, Pet pet) {
        return collectionFamilyDao.getFamilyByIndex(index).addPet(pet);
    }
}
