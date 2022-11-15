package be.intecbrussel;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Opdracht1 {
    // runnable
    public static void main(String[] args) {
        Runnable time = () -> {
            System.out.println(LocalDateTime.now());
        };
        time.run();

// consumer
        Consumer consumer = (c) -> {
            System.out.println("this number is: " + c);
        };
        consumer.accept(5);

        // supplier
        Supplier<Integer> randomNumberSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        int random = randomNumberSupplier.get();
        System.out.println(random);

        // function
        Function<String, Integer> letterCount = (String s) -> {
            return s.length();
        };
        int lengthOfWord = letterCount.apply("Intec");
        System.out.println(lengthOfWord);

        Function<Integer, Integer> sum = (s) -> {
            return s+10;
        };
         sum.apply(20);
        System.out.println(sum.apply(20));
    }
}
