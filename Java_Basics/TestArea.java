abstract class Shape1 {
    public abstract void area();
    public abstract void circum();

    
}
 class Circle extends Shape1{
    float radius =10.10f;
    float pi =3.14f;
    float area;
    float circum;
    @Override
    public void area(){
        area = pi*radius*radius;
        System.out.println("Area of Circle is " + area);

    }

    public void circum(){
        circum=2*pi*radius;
        System.out.println("Cir of Circle is " + circum);
    }

    
}
public class TestArea {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.circum();
    }
}
