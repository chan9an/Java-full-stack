class Bank {

    public void loan(){
        System.out.println("Vechicle is running");
    }
}
class SBI extends Bank {

        int amount = 100000;
        int interest =15;
    public void si(){
         float loan = amount + (interest /100) * amount;


        System.out.println("Total Loan in SBI : " + loan + "for the " + amount + "at the " + interest + " % interest " );
    }
    
   
}

class PNB extends Bank {
    int amount = 150000;
    int interest =17;
public void si(){
     float loan = amount + (interest /100) * amount;


    System.out.println("Total Loan in PNB : " + loan + "for the " + amount + "at the " + interest + " % interest " );
}

    
   
}

public class BankInheritance {

    public static void main(String[] args) {
        
        SBI s = new SBI();
        PNB p= new PNB();
          
        s.si();
        p.si();
        
    }

}
