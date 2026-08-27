public class SearchTargetRecursion {
    public static boolean SearchEle(int[] arr , int tar , int i){
        if(i==arr.length) return false;
        if(arr[i]==tar) return true;
        return SearchEle(arr, tar, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,7,12,76,9,34,99};
        int tar = 99;
        System.out.println(SearchEle(arr, tar, 0));
    }
}