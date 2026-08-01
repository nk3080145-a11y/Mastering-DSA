import java.util.Scanner;
public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int nsp = n-1;
        for(int i=1;i<=n;i++){
            int nst = 1;
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(nst + " ");
                nst++;
            }
            System.out.println();
            nsp--;
        }
        sc.close();
    }
}
