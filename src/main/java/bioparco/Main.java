package bioparco;

import bioparco.model.Eagle;
import bioparco.model.Lion;
import bioparco.model.Tiger;
import bioparco.controller.Zoo;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.getName());

        Zoo zoo = new Zoo();

        Lion lion1 = new Lion("Pippo", "pollo", 3, LocalDate.of(2022, 12, 12), 55.5, 66.2, 12.2);
        Lion lion2 = new Lion("Giacomo", "pesce", 5, LocalDate.of(2021, 12, 12), 75.5, 96.2, 19.2);
        Lion lion3 = new Lion("Pablo", "cane", 1, LocalDate.of(2023, 12, 12), 35.5, 41.2, 6.2);

        Tiger tiger1 = new Tiger("Tommy", "gallina", 3, LocalDate.of(2022, 12, 12), 55.5, 66.2, 12.2);
        Tiger tiger2 = new Tiger("Luca", "cervo", 5, LocalDate.of(2021, 12, 12), 75.5, 93.2, 20.2);
        Tiger tiger3 = new Tiger("Gabriele", "pablo", 1, LocalDate.of(2023, 12, 12), 35.5, 45.2, 6.2);

        Eagle eagle1 = new Eagle("Topolino", "corvo", 3, LocalDate.of(2022, 12, 12), 55.5, 66.2, 12.1);
        Eagle eagle2 = new Eagle("Gigio", "gatto", 5, LocalDate.of(2021, 12, 12), 75.5, 92.2, 15.2);
        Eagle eagle3 = new Eagle("Alice", "rana", 1, LocalDate.of(2023, 12, 12), 35.5, 46.2, 18.3);

        zoo.putAnimal(lion1);
        zoo.putAnimal(lion2);
        zoo.putAnimal(lion3);
        zoo.putAnimal(tiger1);
        zoo.putAnimal(tiger2);
        zoo.putAnimal(tiger3);
        zoo.putAnimal(eagle1);
        zoo.putAnimal(eagle2);
        zoo.putAnimal(eagle3);

        String msgHighestLion = "Il leone piu alto " +  zoo.findHighestAnimalForSpecies(Lion.class);
        String msgHighestTiger = "La tigre piu alta " +  zoo.findHighestAnimalForSpecies(Tiger.class);
        String msgHighestEagle = "L'aquila piu alta " + zoo.findHighestAnimalForSpecies(Eagle.class);

        String msgLowestLion = "Il leone piu basso " + zoo.findLowestAnimalForSpecies(Lion.class);
        String msgLowestTiger = "La tigre piu bassa " + zoo.findLowestAnimalForSpecies(Tiger.class);
        String msgLowestEagle = "L'aquila piu bassa " + zoo.findLowestAnimalForSpecies(Eagle.class);

        String msgHeavierLion = "Il leone piu pesante " + zoo.findHeavierAnimalForSpecies(Lion.class);
        String msgHeavierTiger = "La tigre piu pesante " + zoo.findHeavierAnimalForSpecies(Tiger.class);
        String msgHeavierEagle = "L'aquila piu pesante " + zoo.findHeavierAnimalForSpecies(Eagle.class);

        String msgLightestLion = "Il leone piu leggero " + zoo.findLightestAnimalForSpecies(Lion.class);
        String msgLightestTiger = "La tigre piu leggera " + zoo.findLightestAnimalForSpecies(Tiger.class);
        String msgLightestEagle = "L'aquila piu leggera " + zoo.findLightestAnimalForSpecies(Eagle.class);

        String msgLongestAnimalTail = "L'animale con la coda più lunga " + zoo.findLongestAnimalTail();
        String msgLargerAnimalWingspan = "L'animale con l'apertura alare più ampia " + zoo.findLargerAnimalWingspan();

        logger.info(msgHighestLion);
        logger.info(msgHighestTiger);
        logger.info(msgHighestEagle + "\n");

        logger.info(msgLowestLion);
        logger.info(msgLowestTiger);
        logger.info(msgLowestEagle + "\n");

        logger.info(msgHeavierLion);
        logger.info(msgHeavierTiger);
        logger.info(msgHeavierEagle + "\n");

        logger.info(msgLightestLion);
        logger.info(msgLightestTiger);
        logger.info(msgLightestEagle + "\n");

        logger.info(msgLongestAnimalTail);
        logger.info(msgLargerAnimalWingspan);
    }
}
