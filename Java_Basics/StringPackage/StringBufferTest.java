package StringPackage;

public class StringBufferTest {
    public static void main(String[] args) {
        java.lang.StringBuffer sb1 = new java.lang.StringBuffer("hellloooooooo");
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println("sb1 capacity: " + sb1.capacity());
        System.out.println("sb2 capacity: " + sb2.capacity());
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 after append: " + sb2.append(" I like javascript"));
        System.out.println("sb1 reversed: " + sb1.reverse());
    }
}

 //find the occurence of each char in the string , palindromme or not 
