import java.util.ArrayList;
import java.util.Collections;
public class SubsetSum {
    public static void subsetSum(int[] arr,int idx ,int sum,ArrayList<Integer> ans){
        if(idx==arr.length){
            ans.add(sum);
            return;
        }
        int val = arr[idx];
        subsetSum(arr, idx+1 , sum+val,ans);
        subsetSum(arr,idx+1,sum,ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> ans = new ArrayList<>();
        subsetSum(arr,0,0,ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
