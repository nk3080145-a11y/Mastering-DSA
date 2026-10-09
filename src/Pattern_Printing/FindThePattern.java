/*
n = 4 3 6 1 3 5
    * * * * * *
    * * *   * *
    * * *   * *
    *   *     *
        *     *
        *
*/
package src.Pattern_Printing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindThePattern {
    public static int[] numToArr(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        while(n!=0){
            ans.add(n%10);
            n /= 10;
        }
        Collections.reverse(ans);
        int[] arr = new int[ans.size()];
        n = arr.length;
        for(int i=0;i<n;i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int[] arr = numToArr(n);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
        while(max!=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    System.out.print("* ");
                    arr[i] = arr[i]-1;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            max--;
        }
    }
}
