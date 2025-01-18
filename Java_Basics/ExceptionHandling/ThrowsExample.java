package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {

    public static void show() throws FileNotFoundException {
        File file = new File("/Java_Basics/ExceptionHandling/text1.txt");
        if (!file.exists()) {
            throw new FileNotFoundException("The file text1.txt was not found at the specified path.");
        }
        Scanner sc = new Scanner(file);
        sc.close();
    }

    public static void main(String[] args) {
        try {
            show();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
