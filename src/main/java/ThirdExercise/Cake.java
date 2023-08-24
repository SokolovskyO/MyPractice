package ThirdExercise;

public class Cake extends Present{

    private int calories;

    public Cake(double price, int weight, int calories) {
        super(price, weight);
        this.calories = calories;
    }

    public Cake() {}

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Cake [" + super.toString() + ", calories = " + calories + "]";
    }
}
