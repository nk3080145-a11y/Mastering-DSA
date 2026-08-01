import java.util.Arrays;
import java.util.Scanner;

public class FindPair {
    public static boolean twoSum(int[] arr ,int target){
        Arrays.sort(arr);
        int i = 0 , j = arr.length-1;
        while(i<=j){
            if(arr[i]+arr[j]==target){
                return true;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else i++;
        }
        return false;
    }
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
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        System.out.println(twoSum(arr, target));
        sc.close();
    }
}
