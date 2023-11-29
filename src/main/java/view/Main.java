package view;

import model.Eagle;
import model.Lion;
import model.Tiger;
import controller.Zoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Lion lion1 = new Lion("Pippo", "pollo", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Lion lion2 = new Lion("Giacomo", "pesce", 5, LocalDate.of(2021,12,12),75.5,96.2,19.2);
        Lion lion3 = new Lion("Pablo", "cane", 1, LocalDate.of(2023,12,12),35.5,41.2,6.2);

        Tiger tiger1 = new Tiger("Tommy", "gallina", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Tiger tiger2 = new Tiger("Luca", "cervo", 5, LocalDate.of(2021,12,12),75.5,93.2,20.2);
        Tiger tiger3 = new Tiger("Gabriele", "pablo", 1, LocalDate.of(2023,12,12),35.5,45.2,6.2);

        Eagle eagle1 = new Eagle("Topolino", "corvo", 3, LocalDate.of(2022,12,12),55.5,66.2, 12.1);
        Eagle eagle2 = new Eagle("Gigio", "gatto", 5, LocalDate.of(2021,12,12),75.5,92.2,15.2);
        Eagle eagle3 = new Eagle("Alice", "rana", 1, LocalDate.of(2023,12,12),35.5,46.2,18.3);

        String msgAlto = "l'animale più alto della specie: ";
        String msgBasso = "l'animale più basso della specie: ";
        String msgPesante = "l'animale più pesante della specie: ";
        String msgLeggero = "l'animale più leggero della specie: ";

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);
        zoo.addAnimal(tiger1);
        zoo.addAnimal(tiger2);
        zoo.addAnimal(tiger3);
        zoo.addAnimal(eagle1);
        zoo.addAnimal(eagle2);
        zoo.addAnimal(eagle3);

        Lion highestLion = zoo.findHighestAnimalForSpecies(Lion.class);
        Tiger highestTiger = zoo.findHighestAnimalForSpecies(Tiger.class);
        Eagle highestEagle = zoo.findHighestAnimalForSpecies(Eagle.class);

        Lion lowestLion = zoo.findLowestAnimalForSpecies(Lion.class);
        Tiger lowestTiger = zoo.findLowestAnimalForSpecies(Tiger.class);
        Eagle lowestEagle = zoo.findLowestAnimalForSpecies(Eagle.class);

        Lion heavierLion = zoo.findHeavierAnimalForSpecies(Lion.class);
        Tiger heavierTiger = zoo.findHeavierAnimalForSpecies(Tiger.class);
        Eagle heavierEagle = zoo.findHeavierAnimalForSpecies(Eagle.class);

        Lion lightestLion = zoo.findLightestAnimalForSpecies(Lion.class);
        Tiger lightestTiger = zoo.findLightestAnimalForSpecies(Tiger.class);
        Eagle lightestEagle = zoo.findLightestAnimalForSpecies(Eagle.class);

        System.out.println("\n" + msgAlto + highestLion.getClass().getSimpleName() + " è: " + highestLion.getName());
        System.out.println(msgAlto + highestTiger.getClass().getSimpleName() + " è: " + highestTiger.getName());
        System.out.println(msgAlto + highestEagle.getClass().getSimpleName() + " è: " + highestEagle.getName() + "\n");

        System.out.println(msgBasso + lowestLion.getClass().getSimpleName() + " è: " + lowestLion.getName());
        System.out.println(msgBasso + lowestTiger.getClass().getSimpleName() + " è: " + lowestTiger.getName());
        System.out.println(msgBasso + lowestEagle.getClass().getSimpleName() + " è: " + lowestEagle.getName() + "\n");

        System.out.println(msgPesante + heavierLion.getClass().getSimpleName() + " è: " + heavierLion.getName());
        System.out.println(msgPesante + heavierTiger.getClass().getSimpleName() + " è: " + heavierTiger.getName());
        System.out.println(msgPesante + heavierEagle.getClass().getSimpleName() + " è: " + heavierEagle.getName() + "\n");

        System.out.println(msgLeggero + lightestLion.getClass().getSimpleName() + " è: " + lightestLion.getName());
        System.out.println(msgLeggero + lightestTiger.getClass().getSimpleName() + " è: " + lightestTiger.getName());
        System.out.println(msgLeggero + lightestEagle.getClass().getSimpleName() + " è: " + lightestEagle.getName() + "\n");


        System.out.println("l'animale con la coda più lunga è: " + zoo.findLongestAnimalTail().getName());
        System.out.println("l'animale con l'apertura alare più ampia è: " + zoo.findLargerAnimalWingspan().getName());



    }
}
