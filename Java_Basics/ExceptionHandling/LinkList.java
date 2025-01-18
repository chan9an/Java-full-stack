// Import necessary libraries
package ExceptionHandling;
import java.util.*;

// Define the Node class
class Node {
    int data; // The data stored in the node
    Node next; // Reference to the next node

    // Node constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkList {
    public static void main(String[] args) {

        // Initialize the head of the list
        Node head = null;

        // Create new nodes and add them to the list
        for (int i = 1; i <= 5; i++) {
            Node newNode = new Node(i); // Replace i with the actual data

            // Link the nodes
            if (head == null) {
                // The list is empty, so the new node is the
                // head of the list
                head = newNode;
            } else {
                // The list is not empty, traverse the list to
                // find the last node
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }

                // Now temp points to the last node, link the
                // new node
                temp.next = newNode;
            }
        }

        // Print the list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        // No explicit memory deallocation is needed in Java
        // The Java Garbage Collector will automatically free up the memory
    }
}