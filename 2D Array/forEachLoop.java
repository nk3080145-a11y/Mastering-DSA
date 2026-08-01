public class forEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        for(int a[] : arr){
            for(int ele : a) System.out.print(ele + " ");
            System.out.println();
        }
    }
}
