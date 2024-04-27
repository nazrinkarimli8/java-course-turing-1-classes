package az.edu.turing.mini_project;

public class HappyFamilyApp {
    public static void main(String[] args) {

        Human mother = new Human("Jane", "Karleone", 1940, 88, DayOfWeek.MONDAY);
        Human father = new Human("Vito", "Karleone", 1950, 87, DayOfWeek.SUNDAY);
        Pet pet1 = new Dog("Rock", 5, 75, new String[]{"eat", "drink", "sleep"});

        Family family = new Family(mother, father,pet1);


        Human child1 = new Human("Michael", "Karleone", 1977, 86, DayOfWeek.SATURDAY);
        family.addChild(child1);
        System.out.println(family.countFamily()); // 3
        System.out.println(family); // mother, father, pet, child1


        Human child2 = new Human("Nazrin", "Karimli", 2004, 88888, DayOfWeek.TUESDAY); // iq partladirrrr
        family.addChild(child2);
        System.out.println(family.countFamily()); // 4
        System.out.println(family); // mother, father, pet, child1, child2


        family.deleteChild(child1);  //  Michael övladlığa verildi
        System.out.println(family.countFamily()); // 3
        System.out.println(family);  // mother, father, pet, child2
    }
}
