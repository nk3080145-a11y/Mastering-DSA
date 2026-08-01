import java.util.Scanner;

public class FirstAndLastOccurrence {
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
        int tar;
        System.out.print("Enter target : ");
        tar = sc.nextInt();
        int idx1 = -1 , idx2 = -1;
        int lo = 0 , hi = arr.length-1;
        while(lo<=hi){ 
            int mid = (lo+hi) / 2;
            if(arr[mid]==tar){
                idx1 = mid;
                hi = mid - 1;
            }
            else if(arr[mid]<tar) lo = mid + 1;
            else hi = mid - 1;
        }
        lo = 0;
        hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==tar){
                idx2 = mid;
                lo = mid + 1;
            }
            else if(arr[mid]<tar) lo = mid + 1;
            else hi = mid - 1;
        }
        System.out.print(tar + " First Occurrence and last Occurrence : " + idx1 + " " + idx2);
        sc.close();
    }
}
