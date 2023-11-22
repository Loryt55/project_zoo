package Animals;

import java.time.LocalDate;

public abstract class Animal {
    private String name = "Unknown";
    private String favoriteFood = "Unknown";
    private int age = 0;
    private LocalDate registrationDate = LocalDate.of(1900, 01, 01);
    private double weight = 0.0;
    private double height = 0.0;
    public Animal() {
    }
    public Animal(String name, String favoriteFood, int age, LocalDate registrationDate, double weight, double height) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.registrationDate = registrationDate;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
