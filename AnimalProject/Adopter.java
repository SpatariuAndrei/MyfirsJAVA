package AnimalProject;

public class Adopter {
// atributele clasei
   private String name ;
    private double cashRon ;

    public void setName(String name) {
        this.name = name;
    }
public String getName () {
        return "Name of the adopter is " +  name; }

        public void setCashRon(double cashRon) {
        this.cashRon= cashRon;

        }
        public double getCashRon() {
        return cashRon;
        }
}


