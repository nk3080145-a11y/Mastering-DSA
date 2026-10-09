package src.Stack;

public class HistogramMaxArea {
    public static int maxArea(int[] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]) break;
                count++;
            }
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]) break;
                count++;
            }
            count = arr[i] * count;
            if(max<count) max = count;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {60,20,50,40,10,50,60};
        int ans = maxArea(arr);
        System.out.println(ans);
    }
}
