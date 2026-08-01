import java.util.Scanner;
public class FourNumMax_UsingBuildFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        int b;
        System.out.print("Enter the number : ");
        b = sc.nextInt();
        int c;
         System.out.print("Enter the number : ");
        c = sc.nextInt();
        int d;
        System.out.print("Enter the number : ");
        d = sc.nextInt();
        System.out.println(Math.max(Math.max(a, b) , Math.max(c , d)));
        sc.close();
    }
}