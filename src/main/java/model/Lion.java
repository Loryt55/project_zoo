package model;

import java.time.LocalDate;

public class Lion extends TailedAnimal {
    public Lion(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, registrationDate, weight, height, tailLength);
    }

}
