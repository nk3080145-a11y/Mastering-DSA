import java.util.Scanner;
public class FourDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("This is four digit number");
        }else{
            System.out.println("This is not a four digit number");
        }
        sc.close();
    }
}
