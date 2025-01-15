public class MehtodOverLoading{
    public void display(){
        System.out.println("I am first method");
    }
    public void display(int a){
        System.out.println("I am " + a + " method");
    }
    public static void main(String[] args) {
        MehtodOverLoading m1 = new MehtodOverLoading();
        m1.display();
        m1.display(2);
        
    
}
    
}