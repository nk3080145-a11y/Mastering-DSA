// Search an element in sorted and rotated array

import java.util.Scanner;

public class SearchEleAnRotateArray{
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
        int lo = 0 , hi = arr.length-1;
        int first = lo , second = hi;
        int k , idx=-1;
        System.out.print("Enter target : ");
        k = sc.nextInt();
        if(arr.length==1){
            if(arr[0]==k){
                idx = 0;
            }
        }
        while(lo<hi && idx!=0){
            int mid = (lo+hi)/2;
            if(arr[lo]<arr[mid]){
                lo = mid;
                first = lo;
            }
            else if(arr[hi]>arr[mid]){
                hi = mid;
                second = hi;
            }
            else if(arr[lo]>arr[hi]){
                first = lo;
                second = hi;
                break;
            }
        }
        lo = 0;
        hi = first;
        int count = 0;
        while(lo<=hi && idx!=0){
            int mid = (lo+hi)/2;
            count++;
            if(arr[mid]==k){
                idx = mid;
                break;
            }
            else if(arr[mid]>k){
                hi = mid - 1;
            }
            else if(arr[mid]<k){
                lo = mid + 1;
            }
        }
        lo = second;
        hi = arr.length-1;
        while(lo<=hi && count!=0){
            int mid = (lo+hi)/2;
            if(arr[mid]==k){
                idx = mid;
                break;
            }
            else if(arr[mid]>k){
                hi = mid - 1;
            }
            else if(arr[mid]<k){
                lo = mid + 1;
            }
        }
        System.out.println(idx);
        sc.close();
    }
}