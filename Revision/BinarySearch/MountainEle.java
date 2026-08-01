import java.util.Scanner;

public class MountainEle{
    public static int mountainEle(int[] arr){
        int i = 1 , j = arr.length-2;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) i = mid + 1;
            else j = mid - 1;
        }
        return -1;
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
        System.out.println(mountainEle(arr) + " " + arr[mountainEle(arr)]);
        sc.close();
    }
}