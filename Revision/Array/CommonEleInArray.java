import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class CommonEleInArray {
    public static ArrayList<Integer> commonEleArr(int[] arr1 , int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0 , j = 0 , k = 0;
        while(j<arr2.length && i<arr1.length){
            if(arr1[i]==arr2[j]){
                ans.add(k,arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of first array : ");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter all ele in first Array : ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int m;
        System.out.print("Enter the size of second array : ");
        m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter all ele in second Array : ");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(commonEleArr(arr1, arr2));
        sc.close();
    }
}
