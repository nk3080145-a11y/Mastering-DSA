import java.util.Scanner;

public class MoveAllZeroToEnd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all ele in Array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int val : arr) System.out.print(val + " ");
        sc.close();
    }
}
