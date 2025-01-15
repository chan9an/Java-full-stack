class Vechicle {

    public void running(){
        System.out.println("Vechicle is running");
    }
}
class Bike extends Vechicle {
    public void running(){
        System.out.println("Bike is running");
    }
    
   
}

class Pulsar extends Bike {
    public void running(){
        System.out.println("Pulsar is running");
    }
    
   
}

public class multilevelInheritance {

    public static void main(String[] args) {
        Vechicle v = new Vechicle();
        Bike b = new Bike();
        Pulsar p = new Pulsar();
        v.running();
        p.running();
        b.running();

        
    }

}
