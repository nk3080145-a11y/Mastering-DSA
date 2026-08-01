import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Add1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter all the element : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry==1)  ans.add(carry);
        Collections.reverse(ans);
        for(int val : ans){
            System.out.print(val + " ");
        }
        sc.close();
    }
}