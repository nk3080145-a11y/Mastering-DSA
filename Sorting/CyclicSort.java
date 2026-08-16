public class CyclicSort {
    public static void cyclicSort(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            if(arr[i] == i+1) i++;
            else{
                int idx = arr[i]-1;
                swap(arr,i,idx);
            }
        }
    }
    public static void swap(int[] arr , int i , int idx){
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        cyclicSort(arr);
        for(int val : arr) System.out.print(val + " ");
    }
}
