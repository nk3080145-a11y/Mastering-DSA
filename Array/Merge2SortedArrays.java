import java.util.Scanner;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1;
        System.out.print("Enter the size of first Sorted array : ");
        size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter all the elements of first sorted array : ");
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        int size2;
        System.out.print("Enter the size of second Sorted array : ");
        size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter all the elements of second sorted array : ");
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }
        int[] result = new int[size1+size2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                result[k++] = arr1[i++];
            }
            else{
                result[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            result[k++] = arr1[i++];
        }
        while(j<arr2.length){
            result[k++] = arr2[j++];
        }
        for(int idx=0;idx<result.length;idx++){
            System.out.print(result[idx] + " ");
        }
        sc.close();
    }
}
