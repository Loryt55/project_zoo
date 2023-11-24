package model;
import java.time.LocalDate;

public class Eagle extends WingedAnimal {
    private static final String SPECIES = "Eagle";
    public Eagle(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, registrationDate, weight, height, wingspan);
    }

    @Override
    public String getSpecies() {
        return SPECIES;
    }
}
