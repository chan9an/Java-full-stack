// Define the I1 interface with method signatures
interface I1 {
    void display(); // Method to be implemented in TestInterface1
}

class TestInterface1 implements I1 {

    // Overriding the display method from I1 interface
    public void display() {
        System.out.println("I am the overridden method from I1 interface");
    }

    // Additional method defined in TestInterface1
    public void show() {
        System.out.println("I am the show method");
    }
}

public class TestInterface {

    public static void main(String[] args) {
        // Creating an instance of TestInterface1
        TestInterface1 ti = new TestInterface1();
        
        // Calling the overridden display method from I1 interface
        ti.display();
        
        // Calling the show method from TestInterface1
        ti.show();
    }
}
