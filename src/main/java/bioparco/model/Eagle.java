package bioparco.model;

import bioparco.model.abstracts.WingedAnimal;

import java.time.LocalDate;

public class Eagle extends WingedAnimal {
    public Eagle(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, registrationDate, weight, height, wingspan);
    }
    @Override
    public String toString() {
        return "Nome: " + getName();
    }
}
