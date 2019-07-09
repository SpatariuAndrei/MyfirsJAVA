package lab6.AnimalRescue;

public abstract class Animal {


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;
    private int healthStatus;
    private int age;
    private float heightM;
    private float hungerstats;
    private String name;
    private int Energy;
    private String FavouriteFood;
    private String FavouriteActivity;

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeightM() {
        return heightM;
    }

    public void setHeightM(float heightM) {
        this.heightM = heightM;
    }

    public float getHungerstats() {
        return hungerstats;
    }

    public void setHungerstats(float hungerstats) {
        this.hungerstats = hungerstats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return Energy;
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }

    public String getFavouriteFood() {
        return FavouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        FavouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return FavouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        FavouriteActivity = favouriteActivity;
    }



    // comportamentele clasei- pt fiecare comportament se face clasa separata



    public abstract void eat ();
    public abstract void drink() ;
    public abstract void play();
    public abstract void sleep();
    }
