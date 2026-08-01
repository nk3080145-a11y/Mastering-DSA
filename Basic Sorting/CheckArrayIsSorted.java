import java.util.Scanner;

public class CheckArrayIsSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;
            }
        }
        if(count==arr.length-1){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
        sc.close();
    }
}