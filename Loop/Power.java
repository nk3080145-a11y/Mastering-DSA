import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter base : ");
        a = sc.nextInt();
        int b;
        System.out.print("Enter power : ");
        b = sc.nextInt();
        int p = 1;
        for(int i=1;i<=b;i++){
            p *= a;
        }
        System.out.println(p);
        sc.close();
    }
}
