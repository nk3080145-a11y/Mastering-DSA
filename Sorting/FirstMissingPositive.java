// leetcode 41
public class FirstMissingPositive {
    public static void swap(int[] arr , int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
    public static int firstMissingPositive(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<arr.length){
            int idx = arr[i]-1;
            if(arr[i]>n || arr[i]<=0 || arr[i]==arr[idx]) i++;
            else{
                swap(arr,i,idx);
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) return i+1;
        }
        return n+1;
    }
    public static void main(String[] args) {
        int[] ans = {7,8,9,11,12};
        System.out.println(firstMissingPositive(ans));
    }
}
