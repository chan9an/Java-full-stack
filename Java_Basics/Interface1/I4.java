package Interface1;

public interface I4 {
    
    void show();

    default void defaultShow() {
        System.out.println("I am a default method from Interface I4");
        showData(100);
    }

    static void getData(int a) {
        System.out.println("Your data is " + a);
    }

    private void showData(int b) {
        System.out.println("The data is " + b);
    }
}
