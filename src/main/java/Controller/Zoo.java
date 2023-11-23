package controller;

import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Lion> lionsList;
    private List<Tiger> tigersList;
    private List<Eagle> eagleList;


    public Zoo() {
        this.lionsList = new ArrayList<>();
        this.tigersList = new ArrayList<>();
        this.eagleList = new ArrayList<>();
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

    public void addLion(Lion newLion) {
        lionsList.add(newLion);
    }

    public void addTiger(Tiger newTiger) {
        tigersList.add(newTiger);
    }

    public void addEagle(Eagle newEagle) {
        eagleList.add(newEagle);
    }





    public Lion findHighestLion() {
        Lion currentHighest = lionsList.getFirst();
        for (Lion lion : lionsList) {
            if (lion.getHeight() > currentHighest.getHeight()) {
                currentHighest = lion;
            }
        }
        return currentHighest;
    }

    public Lion findLowestLion() {
        Lion currentLowest = lionsList.getFirst();
        for (Lion lion : lionsList) {
            if (lion.getHeight() < currentLowest.getHeight()) {
                currentLowest = lion;
            }
        }
        return currentLowest;
    }

    public Tiger findHighestTiger() {
        Tiger currentHighest = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getHeight() > currentHighest.getHeight()) {
                currentHighest = tiger;
            }
        }
        return currentHighest;
    }

    public Tiger findLowestTiger() {
        Tiger currentLowest = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getHeight() < currentLowest.getHeight()) {
                currentLowest = tiger;
            }
        }
        return currentLowest;
    }

    public Eagle findHighestEagle() {
        Eagle currentHighest = eagleList.getFirst();
        for (Eagle eagle : eagleList) {
            if (eagle.getHeight() > currentHighest.getHeight()) {
                currentHighest = eagle;
            }
        }
        return currentHighest;
    }

    public Eagle findLowestEagle() {
        Eagle currentLowest = eagleList.getFirst();
        for (Eagle eagle : eagleList) {
            if (eagle.getHeight() < currentLowest.getHeight()) {
                currentLowest = eagle;
            }
        }
        return currentLowest;
    }


    public Lion findHeavierLion() {
        Lion currentHeavier = lionsList.getFirst();
        for (Lion lion : lionsList) {
            if (lion.getWeight() > currentHeavier.getWeight()) {
                currentHeavier = lion;
            }
        }
        return currentHeavier;
    }

    public Lion findLightestLion() {
        Lion currentLighter = lionsList.getFirst();
        for (Lion lion : lionsList) {
            if (lion.getWeight() < currentLighter.getHeight()) {
                currentLighter = lion;
            }
        }
        return currentLighter;
    }

    public Tiger findHeavierTiger() {
        Tiger currentHeavier = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getWeight() > currentHeavier.getWeight()) {
                currentHeavier = tiger;
            }
        }
        return currentHeavier;
    }

    public Tiger findLightestTiger() {
        Tiger currentLighter = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getWeight() < currentLighter.getWeight()) {
                currentLighter = tiger;
            }
        }
        return currentLighter;
    }

    public Eagle findHeavierEagle() {
        Eagle currentHeavier = eagleList.getFirst();
        for (Eagle eagle : eagleList) {
            if (eagle.getWeight() > currentHeavier.getWeight()) {
                currentHeavier = eagle;
            }
        }
        return currentHeavier;
    }

    public Eagle findLightestEagle() {
        Eagle currentLighter = eagleList.getFirst();
        for (Eagle eagle : eagleList) {
            if (eagle.getWeight() < currentLighter.getWeight()) {
                currentLighter = eagle;
            }
        }
        return currentLighter;
    }


    public TailedAnimal findLongestTail() {
        ArrayList<TailedAnimal> felinsList = new ArrayList<>();
        felinsList.addAll(lionsList);
        felinsList.addAll(tigersList);
        TailedAnimal currentLongestTail = felinsList.getFirst();
        for (TailedAnimal animalsTails : felinsList) {
            if (animalsTails.getTailLength() > currentLongestTail.getTailLength()) {
                currentLongestTail = animalsTails;
            }
        }
        return currentLongestTail;
    }

    public WingedAnimal findLargerWingspan() {
        ArrayList<WingedAnimal> birdsList = new ArrayList<>();
        birdsList.addAll(eagleList);
        WingedAnimal currentLargerWingspan = birdsList.getFirst();
        for (WingedAnimal animalsWings : birdsList) {
            if (animalsWings.getWingspan() > currentLargerWingspan.getWingspan()) {
                currentLargerWingspan = animalsWings;
            }
        }
        return currentLargerWingspan;
    }


}


