import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter three number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("The sum of three number is : " + sum);
        sc.close();
    }
}
