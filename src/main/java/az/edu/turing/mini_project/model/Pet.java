package az.edu.turing.mini_project.model;

import java.util.Objects;
import java.util.*;
public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    // Constructors
    public Pet(Species species, String nickname) {
        this.nickname = nickname;
        this.species = species;
    }

    public Pet(Species species,String nickname, int age, int trickLevel, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    // Getters setters

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    // Methods
    public void eat() {
        System.out.println("I am eating.");
    }

    public abstract void respond();

    // toString  equals  hashCode
    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && species == pet.species && Objects.equals(nickname, pet.nickname) && Objects.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, habits);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}