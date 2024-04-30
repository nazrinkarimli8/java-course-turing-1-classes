package az.edu.turing.mini_project;

import az.edu.turing.mini_project.controller.FamilyController;
import az.edu.turing.mini_project.dao.FamilyDao;
import az.edu.turing.mini_project.dao.impl.CollectionFamilyDao;
import az.edu.turing.mini_project.model.Dog;
import az.edu.turing.mini_project.model.Family;
import az.edu.turing.mini_project.model.Human;
import az.edu.turing.mini_project.model.Pet;
import az.edu.turing.mini_project.service.FamilyService;

import java.util.Scanner;

public class HappyFamilyApp {
    public static void main(String[] args) {

//        Human mother = new Human("Jane", "Karleone", 1940, 88);
//        Human father = new Human("Vito", "Karleone", 1950, 87);
//        Pet pet1 = new Dog("Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
//
//        Family family = new Family(mother, father,pet1);
//
//
//        Human child1 = new Human("Michael", "Karleone", 1977);
//        family.addChild(child1);
//        System.out.println(family.countFamily()); // 3
//        System.out.println(family); // mother, father, pet, child1
//
//
//        Human child2 = new Human("Nazrin", "Karimli", 2004, 88888);
//        family.addChild(child2);
//        System.out.println(family.countFamily());
//        System.out.println(family);
//
//
//        family.deleteChild(child1);
//        System.out.println(family.countFamily());
//        System.out.println(family);

        Scanner scanner = new Scanner(System.in);
        FamilyDao familyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(familyDao);
        FamilyController familyController = new FamilyController(familyService);


    }
}
