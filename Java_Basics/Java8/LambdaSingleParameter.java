package Java8;
//import Java8.FunctionalInterfaceWithoutLambdaa;
 interface Test2 {
    public void square(int n);

    
}


public class LambdaSingleParameter {
public static void main(String[] args) {
    Test2 t = n ->{
        System.out.println(n * n);
    };
    t.square(2);
    t.square(3);
    t.square(4);
    t.square(5);
    t.square(6);

}

}
