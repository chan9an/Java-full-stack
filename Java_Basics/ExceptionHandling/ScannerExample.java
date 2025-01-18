package ExceptionHandling;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your ID:  ");
        int id = s.nextInt();
        System.out.println("Your ID is  " + id);

        
        System.out.println("Enter your name:  ");
        String name = s.next();
        System.out.println("Thanks " + name);

        System.out.println("Enter your age:  ");
        int age = s.nextInt();
        System.out.println("Your age is  " + age);

    }

}
