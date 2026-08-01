import java.util.Scanner;
public class RotateArray1 {
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
        d %= n;
        while(d!=0){
            for(int i=0;i<n-1;i++){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            d--;
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
