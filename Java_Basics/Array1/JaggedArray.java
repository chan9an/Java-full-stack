package Array1;

public class JaggedArray {
    int[][] jagged = new int[3][];

    public JaggedArray() {
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
    }

    public void populateArray() {
        jagged[0][0] = 1;
        jagged[0][1] = 2;

        jagged[1][0] = 3;
        jagged[1][1] = 4;
        jagged[1][2] = 5;
        jagged[1][3] = 6;

        jagged[2][0] = 7;
        jagged[2][1] = 8;
        jagged[2][2] = 9;
    }

    public void displayArray() {
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        JaggedArray ja = new JaggedArray();
        ja.populateArray();
        ja.displayArray();
    }
}
