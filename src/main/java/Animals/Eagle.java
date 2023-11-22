package Animals;

import java.time.LocalDate;

public class Eagle extends Bird {
    public Eagle() {}
    public Eagle(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, registrationDate, weight, height, wingspan);
    }
}
