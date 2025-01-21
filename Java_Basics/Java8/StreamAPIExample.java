package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args){
        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> s = data.stream();
        s.map(n-> n*2).forEach(n-> System.out.println(n));
    }

}
 