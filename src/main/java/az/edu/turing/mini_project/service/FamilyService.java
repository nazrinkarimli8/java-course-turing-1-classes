package az.edu.turing.mini_project.service;

import az.edu.turing.mini_project.dao.FamilyDao;
import az.edu.turing.mini_project.model.Family;
import az.edu.turing.mini_project.model.Human;
import az.edu.turing.mini_project.model.Pet;

import java.util.List;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(family -> System.out.println(family.prettyFormat()));
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        List<Family> famList = null;
        try {
            familyDao.getAllFamilies().stream()
                    .filter(family -> family.countFamily() > size)
                    .forEach(family -> famList.add(family));
            return famList;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public List<Family> getFamiliesLessThan(int size) {
        List<Family> famList = null;
        try {
            familyDao.getAllFamilies().stream()
                    .filter(family -> family.countFamily() < size)
                    .forEach(family -> famList.add(family));
            return famList;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public int countFamiliesWithMemberNumber(int number) {
        return (int) familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() == number)
                .count();
    }

    public void createNewFamily(Human father, Human mother) {
        Family newFamily = new Family(mother, father);
        familyDao.saveFamily(newFamily);
    }

    public boolean deleteFamily(int index) {
        return familyDao.deleteFamily(index);
    }

    public boolean deleteFamily(Family family) {
        return familyDao.deleteFamily(family);
    }

    public void saveFamily(Family family) {
        familyDao.saveFamily(family);
    }

    public Family bornChild(Family family, String masculine, String feminine) {
        // Implementation
        return null;
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.getAllFamilies().forEach(family -> {
                List<Human> childrenToRemove = family.getChildren().stream()
                        .filter(child -> (2024 - child.getYear()) > age)
                        .toList();
        childrenToRemove.forEach(family::deleteChild);
    });
}

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamily(int index) {
        return familyDao.getFamily(index);
    }

    public List<Pet> getPets(int index) {
        return familyDao.getAllFamilies().get(index).getPet().stream().toList();
    }

    public void addPet(int index, Pet pet) {
        familyDao.getAllFamilies().get(index).getPet().add(pet);
    }

}
