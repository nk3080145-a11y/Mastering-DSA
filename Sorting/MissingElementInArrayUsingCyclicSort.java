public class MissingElementInArrayUsingCyclicSort {
    public static int findMissing(int[] arr){
        int n = arr.length + 1;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==n || arr[i]==i+1) i++;
            else{
                int idx = arr[i]-1;
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) return i+1;
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findMissing(arr));
    }
}
