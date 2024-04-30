package az.edu.turing.mini_project.model;

import az.edu.turing.mini_project.model.Human;

final class Woman extends Human {
    @Override
    public void greetPet() {
        getFamily().getPet().stream().forEach(pet ->System.out.println("man -----> Hello, " + pet.getNickname()));
    }
    public void makeUp(){
        System.out.println("Woman doing make-up");
    }
}