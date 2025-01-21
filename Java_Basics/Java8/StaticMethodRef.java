package Java8;


interface Test6 {
    public void display();

    
}
public class StaticMethodRef {
    public static void show(){

        System.out.println("I am implemented in Static way");
    }
    public static void main(String[] args){
        Test6 t = StaticMethodRef::show;
        t.display();

        
    }

}
