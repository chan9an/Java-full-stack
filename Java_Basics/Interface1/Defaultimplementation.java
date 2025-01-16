package Interface1;


class TestDefault implements I4{
    public void show(){
        System.out.println("I am abstract show method from Interface");
    }

}


public class Defaultimplementation {
    public static void main(String[] args) {
        TestDefault t1 = new TestDefault();
        t1.show();
        t1.defaultShow();
        I4.getData(200);
    }
}

