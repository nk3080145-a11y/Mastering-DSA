import java.util.Scanner;
public class ThreeNumMax_UsingBuildFun {
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
        int firstMax = Math.max(a,b);
        System.out.println(Math.max(firstMax,c));
        sc.close();
    }
}
