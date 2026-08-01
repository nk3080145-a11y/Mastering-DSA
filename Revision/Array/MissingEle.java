import java.util.Scanner;

public class MissingEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size : ");
        n = sc.nextInt();
        System.out.print("Enter all the element : ");
        int[] arr = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int Tsum = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum += arr[i];
        }
        System.out.println(Tsum-sum);
        sc.close();
    }
}
