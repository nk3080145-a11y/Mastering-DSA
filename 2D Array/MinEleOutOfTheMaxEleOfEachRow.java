// Find the minimum element out of all the maximum element of each row 

import java.util.Scanner;

public class MinEleOutOfTheMaxEleOfEachRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; First way to initialize 2d array
        System.out.println("Enter row and col : ");
        int r = sc.nextInt() , c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter all the element : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Now start the question
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int maxEle = 0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>maxEle) maxEle = arr[i][j];
            }
            if(maxEle<min) min = maxEle;
        }
        System.out.println(min);
        sc.close();
    }
}
