package az.edu.turing.mini_project;

    public class Fish extends Pet {
        public Fish(String nickname, int age, int trickLevel, String[] habits) {
            super(nickname, age, trickLevel, habits);
        }

        @Override
        public void respond() {
            System.out.println("I am swimming gracefully.");
        }
    }

