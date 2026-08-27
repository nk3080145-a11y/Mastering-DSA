import java.util.Scanner;

public class UniquePathsLeetcode{
    public static int UniquePath(int m , int n){
        if(m==1 && n==1) return 1;
        if(m==1) return UniquePath(m, n-1);
        else if(n==1) return UniquePath(m-1, n);
        else return UniquePath(m-1, n) + UniquePath(m, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m , n;
        System.out.print("Enter size of grid : ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println(UniquePath(m,n));
        sc.close();
    }
}