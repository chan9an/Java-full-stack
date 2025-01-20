package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    ArrayDeque<Integer> adq = new ArrayDeque<>();

    public void performOperations() {
        adq.add(10);
        adq.add(20);
        adq.add(30);

        adq.offer(40);
        adq.offer(50);

        adq.addFirst(5);
        adq.addLast(60);

        System.out.println("Deque: " + adq);

        System.out.println("Peek: " + adq.peek());
        System.out.println("Poll: " + adq.poll());
        System.out.println("After Poll: " + adq);

        System.out.println("Peek First: " + adq.peekFirst());
        System.out.println("Peek Last: " + adq.peekLast());

        System.out.println("Remove First: " + adq.removeFirst());
        System.out.println("Remove Last: " + adq.removeLast());

        System.out.println("Final Deque: " + adq);
    }

    public static void main(String[] args) {
        ArrayDeque1 obj = new ArrayDeque1();
        obj.performOperations();
    }
}
