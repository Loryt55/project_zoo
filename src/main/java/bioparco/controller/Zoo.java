package bioparco.controller;

import bioparco.model.abstracts.Animal;
import bioparco.model.abstracts.TailedAnimal;
import bioparco.model.abstracts.WingedAnimal;

import java.util.*;

public class Zoo {
    private final HashMap<Class<? extends Animal>, ArrayList<Animal>> animalHashMap;

    public Zoo() {
        this.animalHashMap = new HashMap<>();
    }

    public Map<Class<? extends Animal>, ArrayList<Animal>> getAnimalHashMap() {
        return animalHashMap;
    }

    public void putAnimal(Animal newAnimal) {
        if (!animalHashMap.containsKey(newAnimal.getClass())) {
            ArrayList<Animal> listSpecies = new ArrayList<>();
            listSpecies.add(newAnimal);
            animalHashMap.put(newAnimal.getClass(), listSpecies);
        } else {
            ArrayList<Animal> listSpecies = animalHashMap.get(newAnimal.getClass());
            listSpecies.add(newAnimal);
        }
    }

    public <T extends Animal> T findHighestAnimalForSpecies(Class<T> animalClass) {
        T currentHighest = null;
        ArrayList<Animal> listSpecies = animalHashMap.get(animalClass);

        for (Animal animal : listSpecies) {
            if (currentHighest == null || (animal.getHeight() > currentHighest.getHeight())) {
                currentHighest = animalClass.cast(animal);
            }
        }
        return currentHighest;
    }

    public <T extends Animal> T findLowestAnimalForSpecies(Class<T> animalClass) {
        T currentHighest = null;
        ArrayList<Animal> listSpecies = animalHashMap.get(animalClass);

        for (Animal animal : listSpecies) {
            if (currentHighest == null || (animal.getHeight() < currentHighest.getHeight())) {
                currentHighest = animalClass.cast(animal);
            }
        }
        return currentHighest;
    }

    public <T extends Animal> T findHeavierAnimalForSpecies(Class<T> animalClass) {
        T currentHeavier = null;
        ArrayList<Animal> listSpecies = animalHashMap.get(animalClass);

        for (Animal animal : listSpecies) {
            if (currentHeavier == null || (animal.getWeight() > currentHeavier.getWeight())) {
                currentHeavier = animalClass.cast(animal);
            }
        }
        return currentHeavier;
    }

    public <T extends Animal> T findLightestAnimalForSpecies(Class<T> animalClass) {
        T currentLighter = null;
        ArrayList<Animal> listSpecies = animalHashMap.get(animalClass);

        for (Animal animal : listSpecies) {
            if (currentLighter == null || (animal.getWeight() < currentLighter.getWeight())) {
                currentLighter = animalClass.cast(animal);
            }
        }
        return currentLighter;
    }

    public TailedAnimal findLongestAnimalTail() {
        List<TailedAnimal> tailedList = new ArrayList<>();
        for (Map.Entry<Class<? extends Animal>, ArrayList<Animal>> animalClass : animalHashMap.entrySet()) {
            if (animalClass.getKey().getSuperclass() == TailedAnimal.class) {
                List<Animal> animalList = animalHashMap.get(animalClass.getKey());
                for (Animal animal : animalList) {
                    tailedList.add((TailedAnimal) animal);
                }
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
        List<WingedAnimal> wingedList = new ArrayList<>();
        for (Map.Entry<Class<? extends Animal>, ArrayList<Animal>> animalClass : animalHashMap.entrySet()) {
            if (animalClass.getKey().getSuperclass() == WingedAnimal.class) {
                List<Animal> animalList = animalHashMap.get(animalClass.getKey());
                for (Animal animal : animalList) {
                    wingedList.add((WingedAnimal) animal);
                }
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


