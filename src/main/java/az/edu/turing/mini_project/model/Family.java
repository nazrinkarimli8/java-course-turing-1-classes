package az.edu.turing.mini_project.model;

import java.util.Objects;
import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private Set<Pet> pet;
    private List<Human> children;

    // Constructors


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = mother;
        this.pet = new HashSet<>();
        this.children = new ArrayList<>();
    }

    public Family(Human mother, Human father, Pet pet, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.pet = new HashSet<>();
        this.children = new ArrayList<>();
    }

    // Getters Setters
    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    // Methods
    public void addChild(Human child) {
        children.add(child);
    }


    public void deleteChild(Human child) {
        children.remove(child);
    }

    public int countFamily() {
        return children.size() + 2;
    }

    public String prettyFormat() {
        return "{mother: %s,\n father: %s,\n pet: %s,\n children: %s}"
                .formatted(mother, father, pet, children);
    }

    // toString  equals  hashCode

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                ", children=" + children +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(pet, family.pet) && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, pet, children);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
