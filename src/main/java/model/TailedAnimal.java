package model;

import java.time.LocalDate;

public abstract class TailedAnimal extends Animal {
    private final double tailLength;

    protected TailedAnimal(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, registrationDate, weight, height);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

}
