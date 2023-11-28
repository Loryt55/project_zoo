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
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHighest == null || (animal.getHeight() > currentHighest.getHeight()))) {
                currentHighest = animal;
            }
        }
        return currentHighest;
    }

    public Animal findLowesAnimalForSpecies(Class<? extends Animal> animalClass) {
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHighest == null || (animal.getHeight() < currentHighest.getHeight()))) {
                currentHighest = animal;
            }
        }
        return currentHighest;
    }

    public Animal findHeavierAnimalForSpecies(Class<? extends Animal> animalClass) {
        Animal currentHeavier = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHeavier == null || (animal.getWeight() > currentHeavier.getWeight()))) {
                currentHeavier = animal;
            }
        }
        return currentHeavier;
    }

    public Animal findLightestAnimalForSpecies(Class<? extends Animal> animalClass) {
        Animal currentLighter = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentLighter == null || (animal.getWeight() < currentLighter.getWeight()))) {
                currentLighter = animal;
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


