import java.util.Scanner;

public class floorEle{
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
        int i = 0 , j = arr.length-1;
        int idx = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<=tar){
                idx = mid ;
                i = mid + 1;
            }
            else j = mid -1;
        }
        System.out.println(idx);
        sc.close();
    }
}