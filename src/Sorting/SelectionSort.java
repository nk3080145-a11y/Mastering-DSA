import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // int m = 0;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}