public class PassingArrayToMethod {
    public static void test(int[] arr){
        arr[2] = 99;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        test(arr);
        System.out.println(arr[2]);
    }
}