import java.util.Scanner;
public class TriangleOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a , b , c;
        System.out.print("Enter three sides of triangle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
        sc.close();
    }
}
