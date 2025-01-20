package Java8;

interface Test {
    public void display();
}

public class FunctionalInterfaceWithoutLambdaa {
    public static void main(String[] args) {
        
        Test testImplementation = new Test() {
            @Override
            public void display() {
                System.out.println("Display method implementation without Lambda.");
            }
        };

       
        testImplementation.display();
    }
}
