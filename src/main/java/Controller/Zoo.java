package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final String ERRORMSG1 = "Specie: ";
    private static final String ERRORMSG2 = ", non trovata";
    private List<Animal> animalsList;
    private List<Lion> lionsList;
    private List<Tiger> tigersList;
    private List<Eagle> eagleList;


    public Zoo() {
        this.animalsList = new ArrayList<>();
        this.lionsList = new ArrayList<>();
        this.tigersList = new ArrayList<>();
        this.eagleList = new ArrayList<>();
    }

    public List<Animal> getAnimalList() {
        return animalsList;
    }

    public List<Lion> getLionsList() {
        return lionsList;
    }

    public List<Tiger> getTigersList() {
        return tigersList;
    }

    public List<Eagle> getEagleList() {
        return eagleList;
    }

    public void addAnimal(Animal newAnimal) {
        animalsList.add(newAnimal);
    }

    public void addLion(Lion newLion) {
        lionsList.add(newLion);
    }

    public void addTiger(Tiger newTiger) {
        tigersList.add(newTiger);
    }

    public void addEagle(Eagle newEagle) {
        eagleList.add(newEagle);
    }

    // Prova 2
    public Animal findHighestAnimalForSpecies(Class<? extends Animal> animalClass) {
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHighest == null || animal.getHeight() > currentHighest.getHeight())) {
                currentHighest = animal;
            }
        }
        return currentHighest;
    }
    public Animal findLowesAnimalForSpecies(Class<? extends Animal> animalClass) {
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHighest == null || animal.getHeight() < currentHighest.getHeight())) {
                currentHighest = animal;
            }
        }
        return currentHighest;
    }



    public Animal findHeavierAnimalForSpecies(Class<? extends Animal> animalClass) {
        Animal currentHeavier = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentHeavier == null || animal.getWeight() > currentHeavier.getWeight())) {
                currentHeavier = animal;
            }
        }
        return currentHeavier;
    }
    public Animal findLightestAnimalForSpecies(Class<? extends Animal> animalClass) {
        Animal currentLighter = null;

        for (Animal animal : animalsList) {
            if (animalClass.isInstance(animal) && (currentLighter == null || animal.getWeight() < currentLighter.getWeight())) {
                currentLighter = animal;
            }
        }
        return currentLighter;
    }







    // Prova 1
    public Animal findHighestAnimalForSpeciesByString(String animalSpecies) {
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animal.getSpecies().equals(animalSpecies) && (currentHighest == null || animal.getHeight() > currentHighest.getHeight())) {
                currentHighest = animal;
            }
        }
        if (currentHighest == null) {
            throw new IllegalArgumentException(ERRORMSG1 + animalSpecies + ERRORMSG2);
        }
        return currentHighest;
    }

    public Animal findLowesAnimalForSpeciesByString(String animalSpecies) {
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animal.getSpecies().equals(animalSpecies) && (currentHighest == null || animal.getHeight() < currentHighest.getHeight())) {
                currentHighest = animal;
            }
        }
        if (currentHighest == null) {
            throw new IllegalArgumentException(ERRORMSG1 + animalSpecies + ERRORMSG2);
        }
        return currentHighest;
    }



    public Animal findHeavierAnimalForSpeciesByString(String animalSpecies) {
        Animal currentHeavier = null;

        for (Animal animal : animalsList) {
            if (animal.getSpecies().equals(animalSpecies) && (currentHeavier == null || animal.getWeight() > currentHeavier.getWeight())) {
                currentHeavier = animal;
            }
        }
        if (currentHeavier == null) {
            throw new IllegalArgumentException(ERRORMSG1 + animalSpecies + ERRORMSG2);
        }
        return currentHeavier;
    }

    public Animal findLightestAnimalForSpeciesByString(String animalSpecies) {
        Animal currentLighter = null;

        for (Animal animal : animalsList) {
            if (animal.getSpecies().equals(animalSpecies) && (currentLighter == null || animal.getWeight() < currentLighter.getWeight())) {
                currentLighter = animal;
            }
        }
        if (currentLighter == null) {
            throw new IllegalArgumentException(ERRORMSG1 + animalSpecies + ERRORMSG2);
        }
        return currentLighter;
    }

    public Animal findLongestAnimalTail() {
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

    public Animal findLargerAnimalWingspan() {
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


