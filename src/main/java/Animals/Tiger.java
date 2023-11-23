package animals;
import java.time.LocalDate;

public class Tiger extends TailedAnimal {
    public Tiger() {
    }

    public Tiger(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, registrationDate, weight, height, tailLength);
    }


}
