import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 1 , high = arr.length - 2 , idx = -1;
        while(low<=high){
            int mid = (low + high ) / 2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                idx = mid ;
                break;
            }
            else if(arr[mid]<arr[mid-1]){
                high = mid - 1;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid + 1;
            }
        }
        System.out.println(idx);
        sc.close();
    }
}
