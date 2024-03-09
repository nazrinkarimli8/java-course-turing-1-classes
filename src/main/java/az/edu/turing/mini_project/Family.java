package az.edu.turing.mini_project;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Pet pet;
    private Human children[];

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = mother;
        this.children = new Human[0];
    }

    public Family(Human mother, Human father, Pet pet, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.children = children;
    }

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void addChild(Human child) {
        child.setFamily(this);
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;
    }


    public boolean deleteChild(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        System.arraycopy(children, 0, newChildren, 0, index);
        System.arraycopy(children, index + 1, newChildren, index, children.length - index - 1);
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return children.length + 2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(pet, family.pet) && Arrays.equals(children, family.children);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                ", children=" + Arrays.toString(children) +
                '}';
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Removing family: " + mother.getName() + " and " + father.getName());
        super.finalize();
    }
}
