package az.edu.turing.mini_project.model;

public class Dog extends Pet {
        public Dog(String nickname, int age, int trickLevel, String[] habits) {
            super(nickname, age, trickLevel, habits);
        }


        @Override
        public void respond() {
            System.out.println("Hav-hav-hav");
        }
    }
