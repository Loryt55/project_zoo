package bioparco;

import bioparco.model.Eagle;
import bioparco.model.Lion;
import bioparco.model.Tiger;
import bioparco.controller.Zoo;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

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

        logger.info("Il leone piu alto è: " + highestLion.getName());
        logger.info("La tigre piu alta è: " + highestTiger.getName());
        logger.info("L'aquila piu alta è: " + highestEagle.getName() + "\n");

        logger.info("Il leone piu basso è: " + lowestLion.getName());
        logger.info("La tigre piu bassa è: " + lowestTiger.getName());
        logger.info("L'aquila piu bassa è: " + lowestEagle.getName() + "\n");

        logger.info("Il leone piu pesante è: " + heavierLion.getName());
        logger.info("La tigre piu pesante è: " + heavierTiger.getName());
        logger.info("L'aquila piu pesante è: " + heavierEagle.getName() + "\n");

        logger.info("Il leone piu leggero è: " + lightestLion.getName());
        logger.info("La tigre piu leggera è: " + lightestTiger.getName());
        logger.info("L'aquila piu leggera è: " + lightestEagle.getName() + "\n");

        logger.info("L'animale con la coda più lunga è: " + zoo.findLongestAnimalTail().getName());
        logger.info("L'animale con l'apertura alare più ampia è: " + zoo.findLargerAnimalWingspan().getName());
    }
}
