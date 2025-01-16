//import BasicAbstract;

abstract class BasicAbstract {
public abstract void display();
public void show(){
    System.out.println("I am non abstract method");
}
}
 class ImplementationClass extends BasicAbstract {
    @Override
    public void display(){
        System.out.println("I am an abstract method");
    }
    
}

public class TestAbstractClass {
    public static void main(String[] args) {
        ImplementationClass ic = new ImplementationClass();
        ic.display();
        /*BasicAbstract basic = new BasicAbstract() {};
        BasicAbstract.ImplementationClass ic = basic.new ImplementationClass();
        ic.display();
        ic.show();*/
    }
}
