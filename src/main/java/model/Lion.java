package model;
import java.time.LocalDate;

public class Lion extends TailedAnimal {
    private static final String SPECIES = "Lion";
    public Lion(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, registrationDate, weight, height, tailLength);
    }

    @Override
    public String getSpecies() {
        return SPECIES;
    }
}
