import java.util.Scanner;

public class RotateArray2 {
    public static void reverse(int[] arr ,int i , int j){
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d ;
        System.out.print("Enter d : ");
        d = sc.nextInt();
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
