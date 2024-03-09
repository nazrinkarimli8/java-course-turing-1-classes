package az.edu.turing.mini_project;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private DayOfWeek schedule;
    private Family family;

    // Constructors
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, DayOfWeek schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public DayOfWeek getSchedule() {
        return schedule;
    }

    public void setSchedule(DayOfWeek schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    public void describePet() {
        String slyLevel = (family.getPet().getTrickLevel() > 50) ? "very sly" : "almost not sly";
        System.out.println("I have an " + family.getPet().getSpecies() + " is " + family.getPet().getAge() + " years old, he is " + slyLevel);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(new DayOfWeek[]{schedule}) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.equals(new DayOfWeek[]{schedule}, new DayOfWeek[]{human.schedule}) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, family);
        result = 31 * result + Arrays.hashCode(new DayOfWeek[]{schedule});
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Removing human: " + name + " " + surname);
        super.finalize();
    }
     final class Woman extends Human{
         @Override
         public void greetPet() {
             System.out.println("woman -----> Hello, " + family.getPet().getNickname());
         }
         public void makeUp(){
             System.out.println("Woman doing make-up");
         }
     }
    final class Man extends Human{
        @Override
        public void greetPet() {
            System.out.println("man -----> Hello, " + family.getPet().getNickname());
        }
        public void repairCar(){
            System.out.println("Man repairing car");
        }
    }
}
