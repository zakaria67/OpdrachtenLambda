package be.intecbrussel;

import java.util.stream.Stream;

public class Opdracht5 {
    public static void main(String[] args) {
        /*
        We gaan lambda’s nu toepassen op Streams. Copy Paste volgende lijn, en vul de Stream aan met lambdas.
         Je gaat enkel de getallen afprinten die deelbaar zijn door 8, nadat je ze gedeeld hebt door 4:

IntStream.of(5,8,640,1111,27,16).
         */
        Integer[] numbers = {5, 8, 640, 1111, 27, 16};

        Stream.of(numbers)
                .map(number -> number / 4)
                .filter(number -> number % 8 == 0)
                //.forEach(System.out::println);
                .forEach(number -> System.out.println(number*4));



        }


    }


