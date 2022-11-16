package be.intecbrussel;

import java.util.stream.Stream;

public class Opdracht6 {
    public static void main(String[] args) {
        /*
        Onderstaande Array kopieer je.

String [] animals = {"Cow","ShaRk", "DOg","PirAnha", "MouSE", "CaT","ParRoT","DOLphin"};


Plaats deze array in een nieuwe array(Gebruik toArray). Alle dieren moeten in lowercase staan, En je houdt enkel de dieren die de letter ‘a’ in hun naam hebben.
// Bonus: Je gaat nu ook de array moeten sorteren op basis van de lengte van het woord. (Hint: Comparator.)

         */
        String [] animals = {"Cow","ShaRk", "DOg","PirAnha", "MouSE", "CaT","ParRoT","DOLphin"};

        Stream.of(animals)
                .map(String::toLowerCase)
                .filter(word->word.contains("a"))
                .forEach(System.out::println);
        //Bonus
        Stream.of(animals)
                .map(String::toLowerCase)
                .filter(word->word.contains("a"))
                .map(word->word.length())
                .sorted()
                .forEach(System.out::println);



    }
}
