package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java.util.function.Predicate;

public class PredicateFuncExample {
    public static void main(String[] args) {
        Predicate<Integer> pred = t -> t % 2 == 0;
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> s = data.stream();
        s.filter(pred).map(n -> n * 2).forEach(System.out::println);

        Stream<Integer> s1 = data.stream();
        int add = s1.filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (a, b) -> a + b);
        
        int max = data.stream().reduce(0, (a, b) -> a > b ? a : b);
        int min = data.stream().reduce(1000, (a, b) -> a < b ? a : b);
        //System.out.println("Prin");
        System.out.println("printing " + max);
        System.out.println("printing " + min);
        System.out.println("Printing " +add);
    }
}
