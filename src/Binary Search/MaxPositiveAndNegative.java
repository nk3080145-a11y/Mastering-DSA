import java.util.Scanner;

public class MaxPositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all element in sorted non-decreasing order : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0 , high = arr.length-1;
        int firstPos = n;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]>0){
                firstPos = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        low = 0;
        high = n - 1;
        int lastNeg = -1;
        while(low<=high){
            int mid = (low + high)/ 2;
            if(arr[mid]<0){
                lastNeg = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        int negCount = lastNeg + 1;
        int posCount = n - firstPos;
        int max = Math.max(negCount, posCount);
        System.out.println(max);
        sc.close();
    }
}
