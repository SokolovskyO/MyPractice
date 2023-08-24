package ThirdExercise;

public abstract class Present {

    double price;

    int weight;

    public Present(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    protected Present() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "price = " + price + ", weight = " + weight;
    }
}
