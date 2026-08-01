import java.util.Scanner;

public class Rotate {
    static void Reverse(int[] arr,int i,int j){
        while(i<j){
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
        System.out.print("Enter size : ");
        n = sc.nextInt();
        System.out.print("Enter all element : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d;
        System.out.print("Enter rotate : ");
        d = sc.nextInt();
        Reverse(arr, 0, d-1);
        Reverse(arr, d, n-1);
        Reverse(arr, 0, n-1);
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
