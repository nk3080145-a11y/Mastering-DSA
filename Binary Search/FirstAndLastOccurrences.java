// import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class FirstAndLastOccurrences{
    public static ArrayList<Integer> solution(int[] arr ,int k){
        ArrayList<Integer> al = new ArrayList<>();
        int low = 0 , high = arr.length , idx1 = -1 , idx2 = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==k){
                high = mid - 1;
                idx1 = mid;
            }
            else if(arr[mid]<k){
                low = mid + 1;
            }
            else if(arr[mid]>k){
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length-1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]==k){
                low = mid + 1;
                idx2 = mid;
            }
            else if(arr[mid]<k){
                low = mid + 1;
            }
            else if(arr[mid]>k){
                high = mid - 1;
            }
        }
        al.add(idx1);
        al.add(idx2);
        return al;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all elements in Sorted order : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.print("Enter the target : ");
        target = sc.nextInt();
        ArrayList<Integer> result = solution(arr, target);
        System.out.print(result);
        sc.close();
    }
}