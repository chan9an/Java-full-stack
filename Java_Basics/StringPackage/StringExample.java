package StringPackage;

public class StringExample {
public static void main(String[] args){
    String str = "Welcome to LPU";
    String str1 = "Welcome to LPU";
    String str2 = new String("Welcome to LPU");
    String str3 = new String("Welcome to LPU");
    int g = 23;
    System.out.println(str);
    
    System.out.println(str2);
    System.out.println(str==str1);//True
    
    System.out.println(str2==str3);//false , it is checking for location 
    System.out.println(str2.equals(str3));//true , it is checking for content.

    System.out.println(str2.compareTo(str1));

}
}
