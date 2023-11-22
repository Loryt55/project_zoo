import Animals.Eagle;
import Animals.Lion;
import Animals.Tiger;
import Controller.Zoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Lion lion_1 = new Lion("Pippo", "pollo", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Lion lion_2 = new Lion("Giacomo", "pesce", 5, LocalDate.of(2021,12,12),75.5,96.2,19.2);
        Lion lion_3 = new Lion("Pablo", "cane", 1, LocalDate.of(2023,12,12),35.5,46.2,6.2);

        Tiger tiger_1 = new Tiger("Tommy", "pollo", 3, LocalDate.of(2022,12,12),55.5,66.2,12.2);
        Tiger tiger_2 = new Tiger("Luca", "pesce", 5, LocalDate.of(2021,12,12),75.5,96.2,20.2);
        Tiger tiger_3 = new Tiger("Gabriele", "cane", 1, LocalDate.of(2023,12,12),35.5,46.2,6.2);

        Eagle eagle_1 = new Eagle("Topolino", "pollo", 3, LocalDate.of(2022,12,12),55.5,66.2, 12.1);
        Eagle eagle_2 = new Eagle("Gigio", "pesce", 5, LocalDate.of(2021,12,12),75.5,96.2,15.2);
        Eagle eagle_3 = new Eagle("Alice", "cane", 1, LocalDate.of(2023,12,12),35.5,46.2,18.3);

        Zoo zoo = new Zoo();

        zoo.getLionsList().add(lion_1);
        zoo.getLionsList().add(lion_2);
        zoo.getLionsList().add(lion_3);

        zoo.getTigersList().add(tiger_1);
        zoo.getTigersList().add(tiger_2);
        zoo.getTigersList().add(tiger_3);
        //sdadsadasdasdasdsasdasdasdas
        zoo.getEagsleList().add(eagle_1);
        zoo.getEagsleList().add(eagle_2);
        zoo.getEagsleList().add(eagle_3);

        System.out.println("Il leone più alto è: " + zoo.highestLion().getName());
        System.out.println("Il leone più basso è: " + zoo.lowestTiger().getName());
        System.out.println("L'aquila più leggera è: " + zoo.lighterEagle().getName());

        System.out.println("L'animale con la coda più lunga è: " + zoo.longTail().getName());
        System.out.println("L'animale con l'apertura alare piu ampia è: " + zoo.wingspan().getName());



    }
}
