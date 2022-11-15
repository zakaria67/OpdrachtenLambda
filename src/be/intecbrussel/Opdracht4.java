package be.intecbrussel;

import java.util.function.BiConsumer;

public class Opdracht4 {
    /* Zoek een manier om 2 waarden mee te geven aan een Consumer en een Function.
     Je gaat hiervoor moeten googlen.
     */
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumer= (c1,c2)->{
            System.out.println("the sum is: "+ (c1+c2));
        };
        consumer.accept(2,5);


    }
    }


