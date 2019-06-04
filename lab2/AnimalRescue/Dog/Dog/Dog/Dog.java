package lab2.AnimalRescue.Dog.Dog.Dog;

public class Dog {

    // ATRIBUTELE CLASEI

    String breed = "labrador";
    int age = 4;
    byte heightM = 1;
    float weightKG = 5;
    String name = "DAF";

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
