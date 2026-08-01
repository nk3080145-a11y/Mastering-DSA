import java.util.Scanner;

public class ReverseAllRows {
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
        // Reverse all rows
        for(int i=0;i<arr.length;i++){
            int j = 0 , k = arr[0].length-1;
            while(j<k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
        //Reverse all column
        for(int j=0;j<arr[0].length;j++){
            int i = 0 , k = arr.length-1;
            while(i<k){
                int temp = arr[i][j];
                arr[i][j] = arr[k][j];
                arr[k][j] = temp;
                i++;
                k--;
            }
        }
        //Now print the array
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
