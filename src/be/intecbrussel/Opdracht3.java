package be.intecbrussel;

import java.util.Random;
import java.util.function.Supplier;

public class Opdracht3 {
    /*Opdracht 3:

Maak Een Supplier die een randomNumber tussen 1en 4 genereert.
 Die randomNumber wordt gebruikt in een Function. Deze functie
 geeft je dan de correcte percentage waarde terug in een Sysout. Bvb.: 1 -> 25%. 4-> 100%
     */
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(4)+1;
        };
        int random = randomNumber.get();
        int pourcentage=0;
        switch (random){
            case 1:
                pourcentage = 25;
                break;
            case 2:
                pourcentage= 50;
                break;
            case 3:
                pourcentage=75;
                break;
            case 4:
                pourcentage=100;
                break;
        }
        System.out.println(random+ " -> "+ pourcentage+"%");
    }
}
