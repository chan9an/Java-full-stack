package StringPackage;

public class NumberofVowels {
    public static void main(String[] args) {
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int p=0;
        str1=str1.toLowerCase();
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                p++;

            }

        }
        System.out.println(p);
    }

}
