public class MergeSort{
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i=0;i<a.length;i++) a[i] = arr[idx++];
        for(int i=0;i<b.length;i++) b[i] = arr[idx++];
        mergeSort(a); mergeSort(b);
        Merge(a,b,arr);
    }
    public static void Merge(int[] a , int[] b , int[] c){
        int i=0 , j=0 , k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        mergeSort(arr);
        for(int val : arr) System.out.print(val + " ");
    }
}