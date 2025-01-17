package Array1;

public class PassingArray {
    public static void getArray(int a[]){
        int max=a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        
        System.out.println("maximum element from an array is " + max);

    }


    public static void main(String[] args) {
        int []b = {12,24,25,26,28,19};
        getArray(b);
        //or getArray(new int[] {12,24,25,26,28,19}) we do not need to name the array even
        getArray((new int[] {1,7,6,7,90,5,44,6,343,56}));
    }

}
