package az.edu.turing.mini_project.dao.impl;

import az.edu.turing.mini_project.model.Family;
import az.edu.turing.mini_project.dao.FamilyDao;

import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    public static List<Family> allFamilies;

    @Override
    public List<Family> getAllFamilies() {
        try {
            return allFamilies;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Family getFamily(int index) {
        try {
            return allFamilies.get(index);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            allFamilies.remove(index);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        try {
            allFamilies.remove(family);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void saveFamily(Family family) {
        if (allFamilies.contains(family)) {
            int index = allFamilies.indexOf(family);
            allFamilies.set(index, family);
        } else {
            allFamilies.add(family);
        }
    }

}
