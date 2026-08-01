import java.util.Scanner;

public class MoveAllZerotoEnd {
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
        for(int i=0;i<arr.length-1;i++){
            int zero = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    zero++;
                }
            }
            if(zero==0) break;
        }
        for(int val : arr) System.out.print(val + " ");
        sc.close();
    }
}
