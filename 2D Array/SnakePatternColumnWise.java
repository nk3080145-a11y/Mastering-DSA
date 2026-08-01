import java.util.Scanner;

public class SnakePatternColumnWise {
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
        System.out.println();
        for(int j=0;j<arr[0].length;j++){
            int i;
            if(j%2==0) i = 0;
            else i = arr.length-1;
            while(i>-1 && i<arr.length){
                System.out.print(arr[i][j] + " ");
                if(j%2==0) i++;
                else i--;
            }
            System.out.println();
        }
        sc.close();
    }
}
