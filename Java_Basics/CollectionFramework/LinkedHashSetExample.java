package CollectionFramework;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        hs.add(100);
        hs.add(101);
        hs.add(102);
        hs.add(103);
        hs.add(104);
        hs.add(104);
        hs.add(105);
        hs.add(99);
        hs.add(null);
        hs.add(200);
        for(Integer j : hs){
            System.out.println(j);
        }
    }
}

