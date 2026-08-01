import java.util.Scanner;

public class MergeTwoArr {
    public static void mergeTwoArr(int[] arr1 , int[] arr2 , int[] ans){
        int i = 0 , j = 0 , k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>=arr2[j]){
                ans[k] = arr2[j];
                j++;
            }else{
                ans[k] = arr1[i];
                i++;
            }
            k++;
        }
        while(i<arr1.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1;
        int size2;
        System.out.print("Enter size of first array : ");
        size1 = sc.nextInt();
        System.out.print("Enter all the Element in first Array : ");
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array : ");
        size2 = sc.nextInt();
        System.out.print("Enter all the Element in second Array : ");
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }
        int ans[] = new int[size1+size2];
        mergeTwoArr(arr1, arr2, ans);
        for(int val : ans) System.out.print(val + " ");
        sc.close();
    }
}
