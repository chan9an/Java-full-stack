package ExceptionHandling;

public class ExceptionHandling1 {
    public static void main(String[] args){
        int n =10;
        int m =0;
        //String str = null;
        System.out.println("Before Exception");
        
       try{
        try{
            System.out.println(n/m);
            //System.out.println(str.length());

        }
        catch(ArithmeticException ae){
            System.out.println("Error" + ae) ;

            System.out.println("I am after Arthimentic Exception");
             String str = null;
             System.out.println("Length of string is " + str.length());

        }
    }
        catch(NullPointerException ne){
            System.out.println("Null........ " + ne);
        }


        System.out.println("End of the code");
    }

}
