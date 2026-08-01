import java.util.Scanner;

public class SumArrayEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all element : ");
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum = " + sum);
        s.close();
    }
}
