package controller;

import model.*;

import java.util.*;

public class Zoo {
    private int contatoreHashMap;
    private int contatoreArrayList;
    private List<Animal> animalsList;
    private HashMap<Class<? extends Animal>, ArrayList<Animal>> animalHashMap;


    public Zoo() {
        this.animalsList = new ArrayList<>();
        this.animalHashMap = new HashMap<>();
        this.contatoreHashMap = 0;
        this.contatoreArrayList = 0;
    }

    public List<Animal> getAnimalList() {
        return this.animalsList;
    }

    public Map<Class<? extends Animal>, ArrayList<Animal>> getAnimalHashMap() {
        return animalHashMap;
    }

    public void addAnimal(Animal newAnimal) {
        contatoreArrayList++;
        animalsList.add(newAnimal);
    }

    public void putAnimal(Animal newAnimal) {
        contatoreHashMap++;
        if (!animalHashMap.containsKey(newAnimal.getClass())) {
            contatoreHashMap++;
            ArrayList<Animal> listSpecies = new ArrayList<>();
            listSpecies.add(newAnimal);
            animalHashMap.put(newAnimal.getClass(), listSpecies);
        } else {
            contatoreHashMap++;
            ArrayList<Animal> listSpecies = animalHashMap.get(newAnimal.getClass());
            listSpecies.add(newAnimal);
        }
    }

    public int getContatoreHashMap() {
        return contatoreHashMap;
    }

    public int getContatoreArrayList() {
        return contatoreArrayList;
    }

    public Animal findHighestAnimalForSpeciesHashMap(Class<? extends Animal> animalClass) {
        contatoreHashMap++;
        Animal currentHighest = null;
        ArrayList<Animal> listSpecies = animalHashMap.get(animalClass);

        for (Animal animal : listSpecies) {
            contatoreHashMap++;
            if (currentHighest == null || (animal.getHeight() > currentHighest.getHeight())) {
                contatoreHashMap++;
                currentHighest = animal;
            }
        }
        return currentHighest;
    }


    public Animal findHighestAnimalForSpecies(Class<? extends Animal> animalClass) {
        contatoreArrayList++;
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            contatoreArrayList++;
            if (animalClass.isInstance(animal) && (currentHighest == null || (animal.getHeight() > currentHighest.getHeight()))) {
                contatoreArrayList++;
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


