package StringPackage;

public class StringExample {
    public static void main(String[] args) {
        String str = "Welcome to LPU";
        String str1 = "Welcome to LPU";
        String str2 = new String("Welcome to LPU");
        String str3 = new String("Welcome to LPU");
        String str4 = "Welcome to lpu";

        int g = 23; 

        System.out.println(str); 
        System.out.println(str2); 
        System.out.println(str == str1); // True
        System.out.println(str2 == str3); // false (checks object references)
        System.out.println(str2.equals(str3)); // true (checks string content)
        System.out.println(str2.compareTo(str1)); // 0 (strings are equal)

        // Concatenation
        String str5 = str + " " + g; 
        System.out.println(str5); // "Welcome to LPU 23"

        // Substring
        String subStr = str.substring(0, 7); 
        System.out.println(subStr); // "Welcome"

        // CharAt
        char c = str.charAt(0); 
        System.out.println(c); // 'W'

        // Length
        int len = str.length(); 
        System.out.println(len); // 14

        // ToUpperCase
        String upperStr = str.toUpperCase(); 
        System.out.println(upperStr); // "WELCOME TO LPU"

        // ToLowerCase
        String lowerStr = str.toLowerCase(); 
        System.out.println(lowerStr); // "welcome to lpu"

        // Contains
        boolean containsLPU = str.contains("LPU"); 
        System.out.println(containsLPU); // true

        // StartsWith
        boolean startsWithWelcome = str.startsWith("Welcome"); 
        System.out.println(startsWithWelcome); // true

        // EndsWith
        boolean endsWithLPU = str.endsWith("LPU"); 
        System.out.println(endsWithLPU); // true

        // Replace
        String replacedStr = str.replace("LPU", "University"); 
        System.out.println(replacedStr); // "Welcome to University"

        // Trim
        String strWithSpaces = "   Hello   "; 
        String trimmedStr = strWithSpaces.trim(); 
        System.out.println(trimmedStr); // "Hello"

        // Split
        String[] words = str.split("  "); 
        for (String word : words) {
            System.out.println(word); 
        } 
    }
}