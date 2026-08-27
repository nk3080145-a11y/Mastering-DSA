import java.util.Scanner;
public class ReversePartOfArray {
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
        int i , j;
        System.out.print("Enter i index : ");
        i = sc.nextInt();
        System.out.print("Enter j index : ");
        j = sc.nextInt();
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
