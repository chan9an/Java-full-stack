class XYZ {
    public void display(int num) {
        System.out.println("Integer: " + num);
    }

    public void display(double num) {
        System.out.println("Double: " + num);
    }

    public void display(Object obj) {
        System.out.println("Object: " + obj.toString());
    }
}

public class AmbiguityExample {
    public static void main(String[] args) {
        XYZ xyz = new XYZ();

        xyz.display(10);       
        xyz.display(10.5);     
        xyz.display("Hello");  
        
        // Ambiguity Example
        xyz.display(null);     
    }
}
