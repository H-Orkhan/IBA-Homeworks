package HomeWork9;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDAO {

    public ArrayList<Family> families = new ArrayList<>();

    public List<Family> getAllFamilies() { return families; }

    @Override
    public Family getFamilyByIndex(int index) {
        if (families.get(index) != null) return families.get(index);
        else throw new IllegalArgumentException("Family is not found");
    }

    @Override
    public boolean deleteFamily(int index) {
        return families.remove(index) != null;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public boolean saveFamily(Family family) { return families.add(family); }

    @Override
    public void updateFamily(Family family) {
        int index = families.indexOf(family);
        families.set(index,family);
    }
}
