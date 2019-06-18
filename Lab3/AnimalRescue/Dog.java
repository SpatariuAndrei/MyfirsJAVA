package Lab3.AnimalRescue;

public class Dog {

    // ATRIBUTELE CLASEI

    private String breed;
    private int healthStatus;
    private int age;
    private float heightM;
    private float hungerstats;
    private String name;
    private int Energy;
    private String FavouriteFood;
    private String FavouriteActivity;


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {

        return breed;
    }


    public void setHealthStatus(int healthStatus) {

        this.healthStatus = healthStatus;

    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setage(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }


    public void setHeightM(float heightM) {
        this.heightM = heightM;
    }

    public float getHeightM() {

        return heightM;
    }

    public void setHungerstats(float hungerstats) {
        this.hungerstats = hungerstats;

    }

    public float getHungerstats() {
        return hungerstats;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;

    }
    public void setEnergy(int energy) {
        this.Energy = Energy;
    }

    public int getEnergy (){
        return Energy;

    }
    public void setFavouriteFood (String FavouriteFood) {
        this.FavouriteFood= FavouriteFood;
    }
    public String getFavouriteFood() {
        return FavouriteFood;
    }
    public void setFavouriteActivity(String FavouriteActivity) {
        this.FavouriteActivity = FavouriteActivity;
    }
    public String getFavouriteActivity()
    {
        return FavouriteActivity;


    }


{
}

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
