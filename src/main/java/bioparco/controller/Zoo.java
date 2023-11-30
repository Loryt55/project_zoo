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
        return animalClass.cast(animalHashMap.get(animalClass).stream()
                .max(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null));
    }

    public <T extends Animal> T findLowestAnimalForSpecies(Class<T> animalClass) {
        return animalClass.cast(animalHashMap.get(animalClass).stream()
                .min(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null));
    }

    public <T extends Animal> T findHeavierAnimalForSpecies(Class<T> animalClass) {
        return animalClass.cast(animalHashMap.get(animalClass).stream()
                .max(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null));
    }

    public <T extends Animal> T findLightestAnimalForSpecies(Class<T> animalClass) {
        return animalClass.cast(animalHashMap.get(animalClass).stream()
                .min(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null));
    }


    public TailedAnimal findLongestAnimalTail() {
        return animalHashMap.values().stream()
                .flatMap(Collection::stream)
                .filter(TailedAnimal.class::isInstance)
                .map(TailedAnimal.class::cast)
                .max(Comparator.comparingDouble(TailedAnimal::getTailLength))
                .orElse(null);
    }

    public WingedAnimal findLargerAnimalWingspan() {
        return animalHashMap.values().stream()
                .flatMap(Collection::stream)
                .filter(WingedAnimal.class::isInstance)
                .map(WingedAnimal.class::cast)
                .max(Comparator.comparingDouble(WingedAnimal::getWingspan))
                .orElse(null);
    }

}


