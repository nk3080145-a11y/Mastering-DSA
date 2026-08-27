import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter all the element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target ;
        System.out.print("Enter the target : ");
        target = sc.nextInt();
        Arrays.sort(arr);
        int low = 0 , high = n-1 , count = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                count++;
                break;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
        }
        if(count==1){
            System.out.print("Yes! I found it element");
        }else{
            System.out.print("There is no element like target in this array");
        }
        sc.close();
    }
}