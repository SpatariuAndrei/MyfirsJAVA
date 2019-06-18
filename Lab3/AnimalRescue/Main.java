package Lab3.AnimalRescue;

public class Main {

    public static void main(String[] args) {

        Dog daf;
        daf = new Dog();
        daf.setage(4);
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
        Yuki.setage(6);
        Yuki.setHealthStatus(9);


        System.out.println(Yuki.getAge());
        System.out.println(Yuki.getHealthStatus());

        Adopter YukiAdopter;
        YukiAdopter = new Adopter();
        YukiAdopter.setName("Horia");


        AnimalFood Pedigree = new AnimalFood();
        Activity FavouriteActivity = new Activity();

        VET Specialist = new VET();





    }




}
