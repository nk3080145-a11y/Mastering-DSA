import java.util.Scanner;

public class FirstOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element in array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.print("Enter target : ");
        target = sc.nextInt();
        // start logic
        int low = 0 , high = n-1  , idx = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==target){
                high = mid - 1;
                idx = mid;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else if(arr[mid]>target){
                high = mid - 1;
            }
        }
        System.out.println("First Occurrence of " + target + " is " + idx);
        sc.close();
    }
}
