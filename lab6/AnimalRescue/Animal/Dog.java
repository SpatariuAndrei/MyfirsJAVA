package lab6.AnimalRescue.Animal;

import lab6.AnimalRescue.Animal.Animal;

public class Dog extends Animal {


    public void bark() {


        System.out.println("WHOF");
    }

    public void happy () {

        System.out.println("wiggle`` tale");
    }


    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void drink() {
        System.out.println("drinks toilet water");


    }
}
