package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample1 {
public static void main(String[] args) {
    LinkedList<String> l1 = new LinkedList<String>();
    l1.add("Sharma");
    l1.add("Jaiswal");
    l1.add("Kohli");
    l1.add("Pant");
    l1.add("Tendulkar");
    l1.add("Dhoni");
    l1.add("Pandaya");
    l1.add("Gill");
    System.out.print("\nLoop: ");
    for(int i =0;i<l1.size();i++){
        System.out.print(l1.get(i) + " ");
    }
    System.out.print("\nIterator: ");
    Iterator<String> itr = l1.iterator();//only forward and not backward.
    while (itr.hasNext()) {
        System.out.print(itr.next() + " ");
        
    }
    ListIterator<String> litr = l1.listIterator();
    System.out.print("\n List Iterator forward: ");
    while (litr.hasNext()) {
        System.out.print(litr.next() + " ");
        
    }
    System.out.print("\n List Iterator previous: ");
    while (litr.hasPrevious()) {
        System.out.print(litr.previous() + " ");
        
    }
}
}
