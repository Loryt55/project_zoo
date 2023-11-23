package animals;
import java.time.LocalDate;

public abstract class WingedAnimal extends Animal {
    private double wingspan;
    protected WingedAnimal(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double wingspan) {
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
