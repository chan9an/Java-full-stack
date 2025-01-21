package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java.util.function.Predicate;

public class PredicateFuncExample {
public static void main(String[] args) {
    Predicate<Integer> pred = new Predicate<Integer>() {
        public boolean test(Integer t){
            return t%2==0;
        }
        
    };
    List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Stream<Integer> s = data.stream();
    s.filter(pred).map(n->n*2).forEach(n-> System.out.println(n));
}
}
