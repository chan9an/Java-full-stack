package StringPackage;

public class StringPalindrome {

    public static void main(String[] args) {
        String str1 = "ahjhaasd";
        int i=0;
        int j =str1.length()-1;
        int h =0;
        while (i<j) {
            char c = str1.charAt(i);
            char d = str1.charAt(j);
            if(c!=d){
                System.out.println("String is not a palindrome");
                h++;
                break;
            }
            i++;
            j--;
        }
        if(h==0){
        System.out.println("String is palindrome");
        }
    }
}
