package Final;

abstract class TestFinalMethod {
    abstract void show();
    
    final void display() {
        System.out.println("I am a final method from abstract");
    }
}

class GetFinalMethod extends TestFinalMethod {
    void show() {
        System.out.println("I am the implementation of the abstract method");
    }
}

public class TestFinal {
    public static void main(String[] args) {
        GetFinalMethod obj = new GetFinalMethod();
        obj.show();
        obj.display();
    }
}
