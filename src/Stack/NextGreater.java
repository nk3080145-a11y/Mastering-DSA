package src.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {1,8,5,2,1,6,4};
        int[] ans = nextGreater(arr);
        for(int val : ans){
            System.out.print(val + " ");
        }
    }

    private static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int currMax = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>currMax){
                ans[i] = -1;
                currMax = arr[i];
            }
            else if(arr[i]<currMax){
                if(arr[i]<curr ) {
                    ans[i] = curr;
                    currMax = arr[i];
                }
                else ans[i] = currMax;
                curr = arr[i];
            }
        }
        return ans;
    }
}
