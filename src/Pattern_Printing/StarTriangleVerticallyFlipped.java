import java.util.Scanner;
public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst++;
        }
        sc.close();
    }
}
