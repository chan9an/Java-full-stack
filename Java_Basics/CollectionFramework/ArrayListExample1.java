package CollectionFramework;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String[] args) {
        List l1 = new ArrayList<>();//Non generic declaration
        List<Integer> l2 = new ArrayList<Integer>(); // generic declaration
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
        l1.add("CSE");
        l1.add(13.6744);
        l1.add(null);
        l1.add(null);//Duplicate Elements are allowed , inseretion order is maintained
        for(int i =0;i<l1.size();i++){
            System.out.print(l1.get(i) + "  ");
        }

        l2.add(12);
        l2.add(11);
        l2.add(42);
        l2.add(41);
        l2.add(43);
        l2.add(457);
        l2.add(null);
        System.out.print("\nL2:  ");
        for(int i =0;i<l2.size();i++){
            System.out.print(l2.get(i) + " ");
        }
        List l3 = new ArrayList<Integer>();
        l3.addAll(l2);
        System.out.print("\nL3:  ");
        for(int i =0;i<l3.size();i++){
            System.out.print(l2.get(i) + " ");
        }

    }
}
