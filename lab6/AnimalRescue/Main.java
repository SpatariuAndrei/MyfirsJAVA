package lab6.AnimalRescue;

import lab6.AnimalRescue.Animal.Cat;
import lab6.AnimalRescue.Animal.Dog;
import lab6.AnimalRescue.Animal.Siamese;
import lab6.AnimalRescue.Food.AnimalFood;

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

        System.out.println("DAF AGE IS:" + daf.getAge());

        AnimalFood FoodStoreDogFood;
        FoodStoreDogFood = new AnimalFood();
        FoodStoreDogFood.setfoodavailability("Dog food In Stock");

        AnimalFood FoodStoreCatFood;
        FoodStoreCatFood = new AnimalFood();
        FoodStoreCatFood.setfoodavailability("Catfood in Stock");
        System.out.println(FoodStoreDogFood.getfoodavailability());

        Adopter dafAdopter;
        dafAdopter = new Adopter();
        dafAdopter.setName("Anca");
        dafAdopter.setCashRon(3000d);
        System.out.println(dafAdopter.getName());


        Dog Yuki = new Dog();
        Yuki.setAge(6);
        Yuki.setHealthStatus(9);


        System.out.println(Yuki.getAge());
        System.out.println(Yuki.getHealthStatus());

        Adopter YukiAdopter;
        YukiAdopter = new Adopter();
        YukiAdopter.setName("Horia");


        AnimalFood Pedigree = new AnimalFood();
        Activity FavouriteActivity = new Activity();

        VET Specialist = new VET();
        Cat Fluffy = new Siamese();
        Fluffy.setAge(6);
       Fluffy.relaxed();
       Fluffy.play();





    }




}
