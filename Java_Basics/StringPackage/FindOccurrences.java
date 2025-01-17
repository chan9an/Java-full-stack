package StringPackage;

public class FindOccurrences {
    public static void main(String[] args) {
        String str = "hello world";
        char target = 'o';
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.println("Found '" + target + "' at index: " + i);
            }
        }
    }
}

