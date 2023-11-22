package Controller;

import Animals.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Lion> lionsList;
    private List<Tiger> tigersList;
    private List<Eagle> eagsleList;


    public Zoo() {
        this.lionsList = new ArrayList<>();
        this.tigersList = new ArrayList<>();
        this.eagsleList = new ArrayList<>();
    }

    public List<Lion> getLionsList() {
        return lionsList;
    }

    public List<Tiger> getTigersList() {
        return tigersList;
    }

    public List<Eagle> getEagsleList() {
        return eagsleList;
    }

    public void addLion (Lion newLion){
        lionsList.add(newLion);
    }
    public void addTiger (Tiger newTiger){
        tigersList.add(newTiger);
    }
    public void addEagle (Eagle newEagle){
        eagsleList.add(newEagle);
    }

    public Lion highestLion() {
        Lion highest = new Lion();
        if (lionsList.isEmpty()){
            highest = new Lion();
        }else {
            highest = lionsList.getFirst();
            for (Lion lion : lionsList) {
                if (lion.getHeight() > highest.getHeight()) {
                    highest = lion;
                }
            }
        }
        return highest;
    }
    public Lion lowestLion() {
        Lion lowest = lionsList.getFirst();
        for (Lion lion : lionsList) {
            if (lion.getHeight() < lowest.getHeight()) {
                lowest = lion;
            }
        }
        return lowest;
    }

    public Tiger highestTiger() {
        Tiger highest = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getHeight() > highest.getHeight()) {
                highest = tiger;
            }
        }
        return highest;
    }
    public Tiger lowestTiger() {
        Tiger lowest = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getHeight() < lowest.getHeight()) {
                lowest = tiger;
            }
        }
        return lowest;
    }

    public Eagle highestEagle() {
        Eagle highest = eagsleList.getFirst();
        for (Eagle eagle : eagsleList) {
            if (eagle.getHeight() > highest.getHeight()) {
                highest = eagle;
            }
        }
        return highest;
    }
    public Eagle lowestEagle() {
        Eagle lowest = eagsleList.getFirst();
        for (Eagle eagle : eagsleList) {
            if (eagle.getHeight() < lowest.getHeight()) {
                lowest = eagle;
            }
        }
        return lowest;
    }


    public Lion heavierLion() {
        Lion heavier = lionsList.getFirst();
        for (Lion lion : lionsList) {
            if (lion.getWeight() > heavier.getWeight()) {
                heavier = lion;
            }
        }
        return heavier;
    }
    public Lion lighterLion() {
        Lion lighter = lionsList.getFirst();
        for (Lion lion : lionsList) {
            if (lion.getWeight() < lighter.getHeight()) {
                lighter = lion;
            }
        }
        return lighter;
    }

    public Tiger heavierTiger() {
        Tiger heavier = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getWeight() > heavier.getWeight()) {
                heavier = tiger;
            }
        }
        return heavier;
    }
    public Tiger lighterTiger() {
        Tiger lighter = tigersList.getFirst();
        for (Tiger tiger : tigersList) {
            if (tiger.getWeight() < lighter.getWeight()) {
                lighter = tiger;
            }
        }
        return lighter;
    }

    public Eagle heavierEagle() {
        Eagle heavier = eagsleList.getFirst();
        for (Eagle eagle : eagsleList) {
            if (eagle.getWeight() > heavier.getWeight()) {
                heavier = eagle;
            }
        }
        return heavier;
    }
    public Eagle lighterEagle() {
        Eagle lighter = eagsleList.getFirst();
        for (Eagle eagle : eagsleList) {
            if (eagle.getWeight() < lighter.getWeight()) {
                lighter = eagle;
            }
        }
        return lighter;
    }


    public Felin longTail (){
        ArrayList<Felin> felinsList = new ArrayList<>();
        felinsList.addAll(lionsList);
        felinsList.addAll(tigersList);
        Felin longTailFelin = felinsList.getFirst();
        for (Felin felin : felinsList) {
            if (felin.getTailLength() > longTailFelin.getTailLength()) {
                longTailFelin = felin;
            }
        }
        return longTailFelin;
    }
    public Bird wingspan(){
        ArrayList<Bird> birdsList = new ArrayList<>();
        birdsList.addAll(eagsleList);
        Bird wingspanBird = birdsList.getFirst();
        for (Bird bird : birdsList) {
            if (bird.getWingspan() > wingspanBird.getWingspan()) {
                wingspanBird = bird;
            }
        }
        return wingspanBird;
    }


}


