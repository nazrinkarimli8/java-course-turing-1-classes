package az.edu.turing.mini_project.dao;

import az.edu.turing.mini_project.model.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamily(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
     void saveFamily (Family family);

}
