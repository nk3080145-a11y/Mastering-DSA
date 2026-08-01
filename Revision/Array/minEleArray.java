import java.util.Scanner;

public class minEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size : ");
        n = sc.nextInt();
        System.out.print("Enter all the element in Array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>arr[i]) min = arr[i];
        }
        System.out.println(min);
        sc.close();
    }
}
