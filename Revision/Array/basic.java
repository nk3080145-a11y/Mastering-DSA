import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all element in the sorted array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        System.out.print("Enter target : ");
        int tar = sc.nextInt();
        int lo = 0 , hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<tar) hi = mid - 1;
            else if(arr[mid]>tar) lo = mid + 1;
            else if(arr[mid]==tar){
                ans = mid;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}