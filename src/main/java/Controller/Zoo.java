package controller;

import model.*;

import java.util.*;

public class Zoo {
    private final List<Animal> animalsList;

    public Zoo() {
        this.animalsList = new ArrayList<>();
    }

    public List<Animal> getAnimalList() {
        return this.animalsList;
    }
    public void addAnimal(Animal newAnimal) {
        animalsList.add(newAnimal);
    }

    public Animal findHighestAnimalForSpecies(Class<? extends Animal> animalClass) {
        return animalsList.stream()
                .filter(animalClass::isInstance)
                .max(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null);
    }

    public Animal findLowesAnimalForSpecies(Class<? extends Animal> animalClass) {
        return animalsList.stream()
                .filter(animalClass::isInstance)
                .min(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null);
    }

    public Animal findHeavierAnimalForSpecies(Class<? extends Animal> animalClass) {
        return animalsList.stream()
                .filter(animalClass::isInstance)
                .max(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null);
    }

    public <T extends Animal> T findLightestAnimalForSpecies(Class<T> animalClass) {
        return animalClass.cast(animalsList.stream()
                .filter(animalClass::isInstance)
                .min(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null));
    }


    public TailedAnimal findLongestAnimalTail() {
        return animalsList.stream()
                .filter(TailedAnimal.class::isInstance).map(TailedAnimal.class::cast)
                .max(Comparator.comparingDouble(TailedAnimal::getTailLength))
                .orElse(null);
    }

    public WingedAnimal findLargerAnimalWingspan() {
        return animalsList.stream()
                .filter(WingedAnimal.class::isInstance).map(WingedAnimal.class::cast)
                .max(Comparator.comparingDouble(WingedAnimal::getWingspan))
                .orElse(null);
    }

}


