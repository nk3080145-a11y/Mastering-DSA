import java.util.Scanner;

public class SearchInASortedMatrix {
    public static boolean searchMatrix(int[][] arr , int x){
        int n = arr.length, m = arr[0].length;
        int lo = 0 , hi = (n*m)-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midRow = mid / m;
            int midCol = mid % m;
            if(arr[midRow][midCol]==x) return true;
            else if(arr[midRow][midCol]>x) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , m;
        System.out.print("Enter row : ");
        n = sc.nextInt();
        System.out.print("Enter column : ");
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter all element : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        boolean flag = searchMatrix(arr , target);
        System.out.println(flag);
        sc.close();
    }
}
