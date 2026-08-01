import java.util.Scanner;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size : ");
        n = sc.nextInt();
        System.out.print("Enter all the element : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0 , j = n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
