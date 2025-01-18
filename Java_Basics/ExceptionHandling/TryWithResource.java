package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("/run/media/csr/New Volume/Java 3rd sem/Java_Basics/ExceptionHandling/text1.txt"))) {
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found: " + fe.getMessage());
        }
    }
}
