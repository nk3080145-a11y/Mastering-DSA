import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class TwoArrayAdd {
    public static Vector<Integer> AddTwpArr(int[] arr , int[] brr){
        Vector<Integer> ans = new Vector<>();
        int size1 = arr.length;
        int size2 = brr.length;
        int carry = 0;
        for(int i=size1-1 , j=size2-1;i>=0 || j>=0;i--,j--){
            if(j>=0 && arr[i]+brr[j]<=9){
                ans.add(arr[i]+brr[j]);
                carry = 0;
            }
            else if(j>=0){
                carry += arr[i]+brr[j];
                ans.add(carry%10);
                carry /= 10;
            }
            else{
                int sum = arr[i] + carry;
                ans.add(sum%10);
                carry /= 10;
            }
        }
        if(carry!=0) ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1;
        int size2;
        System.out.print("Enter size of first array : ");
        size1 = sc.nextInt();
        System.out.print("Enter size of second array : ");
        size2 = sc.nextInt();
        System.out.print("Enter all the Element in first Array : ");
        int arr[] = new int[size1];
        for(int i=0;i<size1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter all the Element in second Array : ");
        int brr[] = new int[size2];
        for(int i=0;i<size2;i++){
            brr[i] = sc.nextInt();
        }
        if(size1>=size2) System.out.println(AddTwpArr(arr, brr));
        else System.out.println(AddTwpArr(brr, arr));
        sc.close();
    }
}
