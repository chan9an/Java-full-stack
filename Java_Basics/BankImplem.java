// Bank interface declaration
interface Bank {
    float getRateOfInterest();  
}


class SBI implements Bank {
    
    public float getRateOfInterest() {
        return 6.5f;  
    }
}


class HDFC implements Bank {
    
    public float getRateOfInterest() {
        return 7.5f;  
    }
}


 class PNB implements Bank{
    public float getRateOfInterest(){
        return 9.0f;
    }

    
}

public class BankImplem {
    public static void main(String[] args) {
      
        SBI s = new SBI();
        HDFC h = new HDFC();
        PNB p  = new PNB();
     
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("HDFC Rate of Interest: " + h.getRateOfInterest());
        System.out.println("PNB Rate of Interest: " + p.getRateOfInterest());
        

        
    }
}
