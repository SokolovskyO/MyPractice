package ThirdExercise;

public class Chocolate extends Present {

    private String countryOfOrigin;

    public Chocolate(double price, int weight, String countryOfOrigin) {
        super(price, weight);
        this.countryOfOrigin = countryOfOrigin;
    }

    public Chocolate() {}

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", countryOfOrigin = " + countryOfOrigin + "]";
    }
}
