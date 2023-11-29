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

    public <T extends Animal> T findHighestAnimalForSpecies(Class<T> animalClass) {
        T currentHighest = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHighest == null || (animal.getHeight() > currentHighest.getHeight()))) {
                currentHighest = animalClass.cast(animal);
            }
        }
        return currentHighest;
    }

    public <T extends Animal> T findLowestAnimalForSpecies(Class<T> animalClass) {
        T currentHighest = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHighest == null || (animal.getHeight() < currentHighest.getHeight()))) {
                currentHighest = animalClass.cast(animal);
            }
        }
        return currentHighest;
    }

    public <T extends Animal> T findHeavierAnimalForSpecies(Class<T> animalClass) {
        T currentHeavier = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHeavier == null || (animal.getWeight() > currentHeavier.getWeight()))) {
                currentHeavier = animalClass.cast(animal);
            }
        }
        return currentHeavier;
    }

    public <T extends Animal> T findLightestAnimalForSpecies(Class<T> animalClass) {
        T currentLighter = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentLighter == null || (animal.getWeight() < currentLighter.getWeight()))) {
                currentLighter = animalClass.cast(animal);
            }
        }
        return currentLighter;
    }

    public TailedAnimal findLongestAnimalTail() {
        ArrayList<TailedAnimal> tailedList = new ArrayList<>();
        for (Animal animal : animalsList) {
            if (animal instanceof TailedAnimal tailedAnimal) {
                tailedList.add(tailedAnimal);
            }
        }
        TailedAnimal currentLongestTail = tailedList.getFirst();
        for (TailedAnimal animalsTails : tailedList) {
            if (animalsTails.getTailLength() > currentLongestTail.getTailLength()) {
                currentLongestTail = animalsTails;
            }
        }
        return currentLongestTail;
    }

    public WingedAnimal findLargerAnimalWingspan() {
        ArrayList<WingedAnimal> wingedList = new ArrayList<>();
        for (Animal animal : animalsList) {
            if (animal instanceof WingedAnimal wingedAnimal) {
                wingedList.add(wingedAnimal);
            }
        }
        WingedAnimal currentLargerWingspan = wingedList.getFirst();
        for (WingedAnimal wingedAnimal : wingedList) {
            if (wingedAnimal.getWingspan() > currentLargerWingspan.getWingspan()) {
                currentLargerWingspan = wingedAnimal;
            }
        }
        return currentLargerWingspan;
    }

}


