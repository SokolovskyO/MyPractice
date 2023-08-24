package ThirdExercise;

public class Candy extends Present {

    private String flavor;

    public Candy(double price, int weight, String flavor) {
        super(price, weight);
        this.flavor = flavor;
    }

    public Candy() {}

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", flavor = " + flavor + "]";
    }
}
