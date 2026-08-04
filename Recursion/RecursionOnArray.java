public class RecursionOnArray{
    public static void recurPrint(int[] arr , int i){      //For printing element in array
        if(i==arr.length) return;
        System.out.print(arr[i] + " ");
        recurPrint(arr, i+1);
    }
    public static void recurPrintReverse(int[] arr , int i){      //For printing reverse element in array
        if(i==arr.length) return;
        recurPrintReverse(arr, i+1);
        System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        recurPrint(arr,0);
        System.out.println();
        recurPrintReverse(arr, 0);
    }
}