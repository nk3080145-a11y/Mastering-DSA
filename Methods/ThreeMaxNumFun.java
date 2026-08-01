import java.util.Scanner;
public class ThreeMaxNumFun {
    public static void max(int a,int b,int c){
        if(a>b && a>c) System.out.println(a);
        else if(b>a && b>c) System.out.println(b);
        else System.out.println(c);
    }
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
        max(a,b,c);
        sc.close();
    }
}
