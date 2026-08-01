import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        sc.close();
    }
}
