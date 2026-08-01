import java.util.Scanner;

public class SwapTwoNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        int b;
        System.out.print("Enter the number : ");
        b = sc.nextInt();
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp ;
        System.out.println(a + " " + b);
        sc.close();
        sc.close();
    }
}
