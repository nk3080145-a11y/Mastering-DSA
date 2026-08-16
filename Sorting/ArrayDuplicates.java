import java.util.ArrayList;
import java.util.Collections;
public class ArrayDuplicates {
    public static void swap(int[] arr , int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
    public static ArrayList<Integer> findDuplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            boolean flag = false;
            if(arr[i]==i+1) i++;
            else{
                int idx = arr[i]-1;
                if(arr[i]==arr[idx]){
                    // ans.add(arr[i]);
                    for(int j=0;j<ans.size();j++) if(ans.get(j)==arr[i]) flag = true;
                    if(flag==false) ans.add(arr[i]);
                    i++;
                    continue;
                }
                swap(arr,i,idx);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 4, 5, 5, 5, 5};
        ArrayList<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
}
