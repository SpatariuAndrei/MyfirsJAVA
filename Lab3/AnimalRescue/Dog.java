package Lab3.AnimalRescue;

public class Dog {

    // ATRIBUTELE CLASEI

    String breed = "labrador";
    int healthStatus = 8;
    int age = 3 ;
    float heightM = 1.3f;
    float hungerstats = 7 ;
    String name = "Daf" ;
    int Energy = 6;
    String FavouriteFood = "Bones";
    String FavouriteActivity = "Running";

    // comportamentele clasei- pt fiecare comportament se face clasa separata

    public void eat () {
        System.out.println("He's eating everything" );
    }
    public void drink() {
        System.out.println("Drinking beer"); }

    public void play() {

        System.out.println("Play with sticks");
    }
}
