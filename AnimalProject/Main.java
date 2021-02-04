package AnimalProject;

import AnimalProject.Animal.Cat;
import AnimalProject.Animal.Dog;
import AnimalProject.Animal.Siamese;
import AnimalProject.Food.AnimalFood;

public class Main {

    public static void main(String[] args) {

        Dog daf;
        daf = new Dog();
        daf.setAge(4);
        daf.setHealthStatus(7);
        daf.setBreed("Labrador");
        daf.setHeightM(1.6f);
        daf.setHungerstats(10);
        daf.setEnergy(10);
        daf.setFavouriteActivity("Running");
        daf.setFavouriteFood("MANANCA TOT");

       // System.out.println("DAF AGE IS:" + daf.getAge());


        AnimalFood FoodStoreDogFood = new AnimalFood();

        AnimalFood FoodStoreCatFood = new AnimalFood();

        FoodStoreCatFood.setfoodquantity(15);
        FoodStoreDogFood.setfoodquantity(0);

      System.out.println(FoodStoreCatFood.getfoodavailability());

        System.out.println(FoodStoreDogFood.getfoodavailability());

        Adopter dafAdopter;
        dafAdopter = new Adopter();
        dafAdopter.setName("Anca");
        dafAdopter.setCashRon(3000d);
       //System.out.println(dafAdopter.getName());


        Dog Yuki = new Dog();
        Yuki.setAge(6);
        Yuki.setHealthStatus(9);


      //  System.out.println(Yuki.getAge());
        //System.out.println(Yuki.getHealthStatus());

        Adopter YukiAdopter;
        YukiAdopter = new Adopter();
        YukiAdopter.setName("Horia");



        Cat Fluffy = new Siamese();
        Fluffy.setAge(6);
       Fluffy.relaxed();
       Fluffy.play();




    }




}
