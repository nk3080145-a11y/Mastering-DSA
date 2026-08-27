import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for(int i=0;i<n;i++){
            product *= arr[i];
        }
        System.out.println(product);
        sc.close();
    }
}
