import java.util.Scanner;

public class SearchEleAnRotateArray2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element An Rotate Array : ");   //Like 8 9 2 3 4
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.print("Enter target : ");
        k = sc.nextInt();
        int lo = 0 , hi = arr.length-1;
        int idx = -1;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            if(arr[mid]==k){
                idx = mid;
                break;
            }
            if(arr[lo]<arr[mid]){
                if(arr[lo]<=k && arr[mid]>k) hi = mid - 1;
                else lo = mid + 1;
            }
            else{
                if(arr[hi]>=k && arr[mid]<k) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        System.out.println(idx);
        sc.close();
    }
}