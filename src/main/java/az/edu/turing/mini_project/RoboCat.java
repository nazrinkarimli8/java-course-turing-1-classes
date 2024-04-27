package az.edu.turing.mini_project;

    public class RoboCat extends Pet {
        public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
            super(nickname, age, trickLevel, habits);
        }

        @Override
        public void respond() {
            System.out.println("I am robo cat");
        }
    }
