public class FindDuplicateEleInArrayUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,2,4,4,1,6,3};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        int duplicate = -1;
        while(i<arr.length){
            if(arr[i]==i+1) i++;
            else{
                int idx = arr[i]-1;
                if(arr[i]==arr[idx]){
                    duplicate =  arr[i];
                    break;
                }
                swap(arr,i,idx);
            }
        }
        return duplicate;
    }
    public static void swap(int[] arr , int i , int idx){
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}

