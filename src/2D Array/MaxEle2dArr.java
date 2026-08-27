import java.util.Scanner;

public class MaxEle2dArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; First way to initialize 2d array
        System.out.println("Enter row and col : ");
        int r = sc.nextInt() , c = sc.nextInt();
        int[][] arr = new int[r][c];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter all the element : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>max) max = arr[i][j];
            }
        }
        System.out.println(max);
        sc.close();
    }
}