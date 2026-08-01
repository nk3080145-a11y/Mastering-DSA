import java.util.Scanner;
public class returnKeyword {
    public static int sun(int a , int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        int b;
        System.out.print("Enter the number : ");
        b = sc.nextInt();
        int sum = sun(a, b);
        System.out.println(sum);
        sc.close();
    }
}
