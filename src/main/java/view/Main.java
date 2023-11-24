package view;

import model.Eagle;
import model.Lion;
import model.Tiger;
import controller.Zoo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lion lion1 = new Lion("Pippo", "pollo", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Lion lion2 = new Lion("Giacomo", "pesce", 5, LocalDate.of(2021,12,12),75.5,96.2,19.2);
        Lion lion3 = new Lion("Pablo", "cane", 1, LocalDate.of(2023,12,12),35.5,41.2,6.2);

        Tiger tiger1 = new Tiger("Tommy", "gallina", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Tiger tiger2 = new Tiger("Luca", "cervo", 5, LocalDate.of(2021,12,12),75.5,93.2,20.2);
        Tiger tiger3 = new Tiger("Gabriele", "pablo", 1, LocalDate.of(2023,12,12),35.5,45.2,6.2);

        Eagle eagle1 = new Eagle("Topolino", "corvo", 3, LocalDate.of(2022,12,12),55.5,66.2, 12.1);
        Eagle eagle2 = new Eagle("Gigio", "gatto", 5, LocalDate.of(2021,12,12),75.5,92.2,15.2);
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

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);
        zoo.addAnimal(tiger1);
        zoo.addAnimal(tiger2);
        zoo.addAnimal(tiger3);
        zoo.addAnimal(eagle1);
        zoo.addAnimal(eagle2);
        zoo.addAnimal(eagle3);

        System.out.println("l'animale più alto della specie: " + " è: " + zoo.findHighestAnimalForSpecies(Tiger.class).getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire specie");
        String animalSearched = scanner.nextLine();

        System.out.println("l'animale più alto della specie: " + animalSearched + " è: " + zoo.findHighestAnimalForSpeciesByString(animalSearched).getName());
        System.out.println("l'animale più basso della specie: " + animalSearched + " è: " + zoo.findLowesAnimalForSpeciesByString(animalSearched).getName());

        System.out.println("l'animale più pesante della specie: " + animalSearched + " è: " + zoo.findHeavierAnimalForSpeciesByString(animalSearched).getName());
        System.out.println("l'animale più leggero della specie: " + animalSearched + " è: " + zoo.findLightestAnimalForSpeciesByString(animalSearched).getName());

        System.out.println("l'animale con la coda più lunga è: " + zoo.findLongestAnimalTail().getName());
        System.out.println("l'animale con l'apertura alare più ampia è: " + zoo.findLargerAnimalWingspan().getName());


    }
}
