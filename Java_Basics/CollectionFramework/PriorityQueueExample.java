
package CollectionFramework;


import java.util.PriorityQueue;;
public class PriorityQueueExample {

    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(89);
        pq.add(13);
        pq.add(15);
        pq.add(7);
        pq.add(16);
        pq.add(9);
        

        System.out.println(pq.poll());
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        for (Integer u : pq) {
            System.out.println(u);
            
        }
    }



}
