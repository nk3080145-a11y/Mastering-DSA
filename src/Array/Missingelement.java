import java.util.Scanner;

public class Missingelement{
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
        long size = arr.length+1;
        long sum = size*(size+1)/2;
        long arrsum = 0;
        for(int i=0;i<n;i++){
            arrsum += arr[i];
        }
        int ans = (int)(sum-arrsum);
        System.out.println(ans);
        sc.close();
    }
}