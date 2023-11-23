package controller;

import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private  List<Animal> animalsList;
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


    public Animal findHighestAnimalForSpecies(String animalSpecies) {
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animal.getSpecies().equals(animalSpecies)) {
                if (currentHighest == null || animal.getHeight() > currentHighest.getHeight()) {
                    currentHighest = animal;
                }
            }
        }if (currentHighest == null){
            throw new IllegalArgumentException("Specie: " + animalSpecies + ", non trovata: " + animalSpecies);
        }
        return currentHighest;
    }

    public Animal findLowesAnimalForSpecies(String animalSpecies) {
        Animal currentHighest = null;

        for (Animal animal : animalsList) {
            if (animal.getSpecies().equals(animalSpecies)) {
                if (currentHighest == null || animal.getHeight() < currentHighest.getHeight()) {
                    currentHighest = animal;
                }
            }
        }if (currentHighest == null){
            throw new IllegalArgumentException("Specie: " + animalSpecies + ", non trovata: " + animalSpecies);
        }
        return currentHighest;
    }

    //Presenza di cast
    public Animal findLongestAnimalTail() {
        ArrayList<Animal> tailedAnimalsList = new ArrayList<>();
        for (Animal animal: animalsList) {
            if (animal instanceof TailedAnimal){
                tailedAnimalsList.add(animal);
            }
        }
        ArrayList<TailedAnimal> tailedList = new ArrayList<>();
        for (Animal tailedAnimal : tailedAnimalsList) {
            tailedList.add((TailedAnimal) tailedAnimal);
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
        ArrayList<Animal> WingspanAnimalsList = new ArrayList<>();
        for (Animal animal: animalsList) {
            if (animal instanceof WingedAnimal){
                WingspanAnimalsList.add(animal);
            }
        }
        ArrayList<WingedAnimal> wingedList = new ArrayList<>();
        for (Animal wingedAnimal : WingspanAnimalsList) {
            wingedList.add((WingedAnimal) wingedAnimal);
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


