import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class TwoArrayAdd {
    public static Vector<Integer> Add(int[] arr1 , int[] arr2){
        Vector<Integer> ans = new Vector<>();
        int carry = 0;
        for(int i=arr1.length-1,j=arr2.length-1;i>=0 || j>=0;i--,j--){
            if( j>=0 && arr1[i]+arr2[j]+carry<=9){
                ans.add(arr1[i]+arr2[j]+carry);
                carry = 0;
            }
            else if(j>=0){
                carry += arr1[i] + arr2[j];
                ans.add(carry%10);
                carry = carry/10;
            }
            else {
                int sum = arr1[i] + carry;
                ans.add(sum%10);
                carry = sum/10;
            }
        }
        if(carry!=0) ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 , size2;
        System.out.print("Enter the size of first array : ");
        size1 = sc.nextInt();
        System.out.print("Enter the size of second array : ");
        size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.print("Enter all element in first array : ");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter all element in second array : ");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        if(size1>=size2){
            System.out.print(Add(arr1 , arr2));
        }
        else{
            System.out.print(Add(arr2 , arr1));
        }
        sc.close();
    }
}
