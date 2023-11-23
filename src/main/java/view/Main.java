package view;

import animals.Eagle;
import animals.Lion;
import animals.Tiger;
import controller.Zoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Lion lion1 = new Lion("Pippo", "pollo", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Lion lion2 = new Lion("Giacomo", "pesce", 5, LocalDate.of(2021,12,12),75.5,96.2,19.2);
        Lion lion3 = new Lion("Pablo", "cane", 1, LocalDate.of(2023,12,12),35.5,46.2,6.2);

        Tiger tiger1 = new Tiger("Tommy", "gallina", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Tiger tiger2 = new Tiger("Luca", "cervo", 5, LocalDate.of(2021,12,12),75.5,96.2,20.2);
        Tiger tiger3 = new Tiger("Gabriele", "pablo", 1, LocalDate.of(2023,12,12),35.5,46.2,6.2);

        Eagle eagle1 = new Eagle("Topolino", "corvo", 3, LocalDate.of(2022,12,12),55.5,66.2, 12.1);
        Eagle eagle2 = new Eagle("Gigio", "gatto", 5, LocalDate.of(2021,12,12),75.5,96.2,15.2);
        Eagle eagle3 = new Eagle("Alice", "rana", 1, LocalDate.of(2023,12,12),35.5,46.2,18.3);

        Zoo zoo = new Zoo();

        zoo.getLionsList().add(lion1);
        zoo.getLionsList().add(lion2);
        zoo.getLionsList().add(lion3);

        zoo.getTigersList().add(tiger1);
        zoo.getTigersList().add(tiger2);
        zoo.getTigersList().add(tiger3);

        zoo.getEagleList().add(eagle1);
        zoo.getEagleList().add(eagle2);
        zoo.getEagleList().add(eagle3);

        System.out.println("Il leone più alto è: " + zoo.findHighestLion().getName());
        System.out.println("Il leone più basso è: " + zoo.findLowestTiger().getName());
        System.out.println("L'aquila più leggera è: " + zoo.findLightestEagle().getName());

        System.out.println("L'animale con la coda più lunga è: " + zoo.findLongestTail().getName());
        System.out.println("L'animale con l'apertura alare piu ampia è: " + zoo.findLargerWingspan().getName());



    }
}
