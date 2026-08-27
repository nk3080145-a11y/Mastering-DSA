import java.util.Arrays;
public class DeepCopyAndShallowCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] x = arr; //This is shallow copy
        System.out.println(arr[2]);
        x[2] = 100;
        System.out.println(arr[2]);
        int[] y = Arrays.copyOf(arr,arr.length);   //This is deep copy
        System.out.println(arr[0]);
        y[0] = 11;
        System.out.println(arr[0]);
    }
}
