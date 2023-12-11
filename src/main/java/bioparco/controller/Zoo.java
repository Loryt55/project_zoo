package bioparco.controller;

import bioparco.model.abstracts.Animal;
import bioparco.model.abstracts.TailedAnimal;
import bioparco.model.abstracts.WingedAnimal;

import java.util.*;
import java.util.stream.Stream;

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
        if(!animalHashMap.containsKey(animalClass)){
            return null;
        }
        return animalClass.cast(animalHashMap.get(animalClass)
                .stream()
                .max(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null));
    }

    public <T extends Animal> T findLowestAnimalForSpecies(Class<T> animalClass) {
        if(!animalHashMap.containsKey(animalClass)){
            return null;
        }
        return animalClass.cast(animalHashMap.get(animalClass)
                .stream()
                .min(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null));
    }

    public <T extends Animal> T findHeavierAnimalForSpecies(Class<T> animalClass) {
        if(!animalHashMap.containsKey(animalClass)){
            return null;
        }
        return animalClass.cast(animalHashMap.get(animalClass)
                .stream()
                .max(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null));
    }

    public <T extends Animal> T findLightestAnimalForSpecies(Class<T> animalClass) {
        if(!animalHashMap.containsKey(animalClass)){
            return null;
        }
        return animalClass.cast(animalHashMap.get(animalClass)
                .stream()
                .min(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null));
    }

    public TailedAnimal findLongestAnimalTail() {
        return getSuperClassStream(TailedAnimal.class)
                .max(Comparator.comparingDouble(TailedAnimal::getTailLength))
                .orElse(null);
    }


    public WingedAnimal findLargerAnimalWingspan() {
        return getSuperClassStream(WingedAnimal.class)
                .max(Comparator.comparingDouble(WingedAnimal::getWingspan))
                .orElse(null);
    }

    private <T extends Animal> Stream<T> getSuperClassStream(Class<T> animalSuperClass) {
        return animalHashMap.entrySet()
                .stream()
                .filter(entryAnimalMap -> animalSuperClass.isAssignableFrom(entryAnimalMap.getKey()))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .map(animalSuperClass::cast);
    }

    /* private <T extends Animal> Stream<T> getSuperClassStream(Class<T> animalSuperClass) {
        return animalHashMap.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(animalSuperClass::isInstance)
                .map(animalSuperClass::cast);
    }*/

}


