package lab6.AnimalRescue.Animal;

import lab6.AnimalRescue.Animal.Animal;

public class Cat extends Animal {


    public void relaxed(){

        System.out.println("puur puur puuur");
    }
    public void angry() {

        System.out.println("scratches");
    }

    @Override
    public void eat() {
        System.out.println("eats only whiskas");

    }

    @Override
    public void drink() {
        System.out.println("only drnks from crystal bowls");

    }

    @Override
    public void sleep() {
        System.out.println("sleeps all the time");

    }

    public void play (){
        System.out.println("runs after mice");



}
}