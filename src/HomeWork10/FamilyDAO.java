package HomeWork10;

import java.util.List;

public interface FamilyDAO {

    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    boolean saveFamily(Family family);

    void updateFamily(Family family);
}
