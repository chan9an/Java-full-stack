package CollectionFramework;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeProjectExa {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Peek at the smallest element");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter element to insert:");
                    String addElement = scanner.nextLine();
                    treeSet.add(addElement);
                    System.out.println("Element inserted.");
                    break;
                case 2:
                    System.out.println("Enter element to delete:");
                    String removeElement = scanner.nextLine();
                    if (treeSet.remove(removeElement)) {
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    if (!treeSet.isEmpty()) {
                        System.out.println("Smallest element: " + treeSet.first());
                    } else {
                        System.out.println("TreeSet is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
