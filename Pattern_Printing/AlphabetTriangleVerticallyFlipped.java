import java.util.Scanner;
public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int nsp = n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char)(i+64) + " ");
            }
            nsp--;
            System.out.println();
        }
        sc.close();
    }
}
