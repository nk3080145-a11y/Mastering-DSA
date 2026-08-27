import java.util.Scanner;

public class Segregate0sAnd1s{
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
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}