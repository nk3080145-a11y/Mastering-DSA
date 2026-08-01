import java.util.Scanner;

public class BinarySearchDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all element in descending order : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.print("Enter target : ");
        target = sc.nextInt();
        int low = 0 , high = arr.length - 1 , idx = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]==target){
                idx = mid;
                break;
            }
            else if(arr[mid]<target){
                high = mid - 1;
            }
            else if(arr[mid]>target){
                low = mid + 1;
            }
        }
        if(idx==(-1)){
            System.out.print("Target is not found : " + idx);
        }else{
            System.out.print("Target is found : " + idx);
        }
        sc.close();
    }
}
