// Pint sum of number and its reverse 
// for eg n = 1286 then r = 6821 sum = 8107
import java.util.Scanner;
public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        System.out.println("Number is : " + n);
        int reverse = 0;
        int digit = n;
        while(digit!=0){
            reverse *= 10;
            reverse += (digit%10);
            digit /= 10;
        }
        System.out.println("Reverse is : " + reverse);
        int sum = reverse + n;
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
