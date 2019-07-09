package lab6.AnimalRescue;

public class AnimalFood {

    private String foodname;
    private float foodpriceRonkg;
    private float foodquantity;
    private String foodavailability;

    public void setfoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getfoodname() {
        return foodname;
    }

    public void setFoodpriceRonkg(float foodpriceRonkg) {
        this.foodpriceRonkg = foodpriceRonkg;
    }

    public float getfoodpricekgRon() {

        return foodpriceRonkg;
    }

    public void setfoodquantity(float foodquantity) {
        this.foodquantity = foodquantity;
    }

    public float getfoodquantity() {
        return foodquantity;
    }

    public void setfoodavailability(String foodavailability) {
        this.foodavailability = foodavailability;
    }

    public String getfoodavailability() {
        return foodavailability;

    }
}
