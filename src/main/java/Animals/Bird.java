package Animals;
import java.time.LocalDate;

public abstract class Bird extends Animal {
    private double wingspan = 0.0;
    public Bird() {}
    public Bird(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, registrationDate, weight, height);
        this.wingspan = wingspan;
    }
    public double getWingspan() {
        return wingspan;
    }
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
