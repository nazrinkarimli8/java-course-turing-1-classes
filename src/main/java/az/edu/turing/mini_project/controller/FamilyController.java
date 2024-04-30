package az.edu.turing.mini_project.controller;

import az.edu.turing.mini_project.service.FamilyService;
import az.edu.turing.mini_project.model.Family;
import az.edu.turing.mini_project.model.Human;
import az.edu.turing.mini_project.model.Pet;

import java.util.List;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        return familyService.getFamiliesBiggerThan(size);
    }

    public List<Family> getFamiliesLessThan(int size) {
        return familyService.getFamiliesLessThan(size);
    }

    public int countFamiliesWithMemberNumber(int number) {
        return familyService.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human father, Human mother) {
        familyService.createNewFamily(father, mother);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyService.deleteFamily(index);
    }

    public boolean deleteFamilyByFamily(Family family) {
        return familyService.deleteFamily(family);
    }

    public void saveFamily(Family family) {
        familyService.saveFamily(family);
    }

    public Family bornChild(Family family, String masculine, String feminine) {
        return null;
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyByIndex(int index) {
        return familyService.getFamily(index);
    }

    public List<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

}
