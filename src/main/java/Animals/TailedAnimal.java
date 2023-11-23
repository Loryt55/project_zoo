package animals;

import java.time.LocalDate;

public abstract class TailedAnimal extends Animal {
    private double tailLength = 0.0;
    public TailedAnimal(){}
    public TailedAnimal(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, registrationDate, weight, height);
        this.tailLength = tailLength;
    }
    public double getTailLength() {
        return tailLength;
    }
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }



}
