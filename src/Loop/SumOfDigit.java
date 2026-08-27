import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int sum = 0;
        int r;
        if(n<0){
            n = -n;
        }
        while(n!=0){
            r = n%10;
            sum += r;
            n /= 10;
        }
        System.out.println("Sum of digits of a number is : " + sum);
        sc.close();
    }
}