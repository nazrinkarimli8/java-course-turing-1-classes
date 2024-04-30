package az.edu.turing.mini_project.model;

import java.util.Objects;
import java.util.*;

public class Human {
    private String name;
    private String surname;
    private long year;
    private int iq;
    private Map<String,String> schedule;
    private Family family;

    // Constructors
    public Human(String name, String surname, long year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, long year,int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(String name, String surname, long year, int iq, Map<String, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human() {
    }

    // Getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    // Methods

    public void greetPet() {
        for (int i = 0; i < family.getPet().size(); i++) {
            family.getPet().stream().forEach(pet -> System.out.println("man -----> Hello, " + pet.getNickname()));
        }
    }


    public void describePet() {
        for (int i = 0; i < family.getPet().size(); i++) {
            family.getPet().stream().forEach(
                    pet -> System.out.println("I have an "+ pet.getSpecies()+
                            "is" + pet.getAge()+
                            " years old, he is " + ((pet.getTrickLevel()>50)
                    ? "very sly." : "almost not sly.")));
        }
    }


    // toString  equals  hashCode
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, schedule, family);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
