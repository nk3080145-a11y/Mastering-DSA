import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int reverse = 0;
        int r;
        while(n != 0){
            r = n % 10;
            reverse += r;
            n /= 10;
            reverse *= 10;
        }
        reverse /= 10;
        System.out.println("Reverse no : " + reverse);
        sc.close();
    }
}
