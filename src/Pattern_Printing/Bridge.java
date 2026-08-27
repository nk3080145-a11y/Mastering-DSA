import java.util.Scanner;
public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int nst = n-1;
        int nsp = 1;
        for(int i=1;i<=(n*2)-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp += 2;
            nst--;
        }
        sc.close();
    }
}
