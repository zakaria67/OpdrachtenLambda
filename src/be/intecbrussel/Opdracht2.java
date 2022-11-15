package be.intecbrussel;

import java.util.function.Consumer;

public class Opdracht2 {
    /*Opdracht 2:

Maak een Consumer Object waarbij dat je de leeftijd van de gebruiker moet vragen.
 Als die jonger is dan 18 jaar, dan print de functie: “You’re too young!”
  Als die ouder is dan 17 jaar, dant print de functie: “You’re too old.
     */
    public static void main(String[] args) {
        Consumer<Integer> consumer = (c) -> {
            if (c < 18) {
                System.out.println("You’re too young!");

            } else if (c > 18) {
                System.out.println("You’re too old");
            } else {
                System.out.println("Age not valid");
            }
        };
        consumer.accept(32);

    }


}


