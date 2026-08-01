import java.util.Scanner;

public class FindRowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; First way to initialize 2d array
        System.out.println("Enter row and col : ");
        int r = sc.nextInt() , c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter all the element : ");
        int maxRow = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                if(maxRow<=sum){
                    maxRow = sum;
                    idx = i;
                }
            }
        }
        System.out.println(idx);
        sc.close();
    }
}
