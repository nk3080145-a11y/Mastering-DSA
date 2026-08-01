import java.util.Scanner;
public class findSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int square = n * n;
        System.out.println("The square of given number is : " + square);
        sc.close();
    }
}
