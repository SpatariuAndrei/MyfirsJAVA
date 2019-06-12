package Lab3.AnimalRescue;

public class Main {

    public static void main(String[] args) {

        Dog daf;
        daf = new Dog();


        Dog Yuki = new Dog();
        Yuki.age = 8;

        Adopter Iustin;
        Iustin = new Adopter();

        AnimalFood Pedigree = new AnimalFood();
        Activity FavouriteActivity = new Activity();

        VET Specialist = new VET();




        System.out.println(daf.age);
        System.out.println(daf.heightM);
        System.out.println(daf.Energy);
        System.out.println(Iustin.cashRon);
        System.out.println(Pedigree.foodpriceRon);
        System.out.println(FavouriteActivity.Activityname);
        System.out.println(Specialist.name);
        System.out.println(Yuki.age);
    }




}
