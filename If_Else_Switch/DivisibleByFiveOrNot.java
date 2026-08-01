import java.util.Scanner;
public class DivisibleByFiveOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n%5==0){
            System.out.println("This number is divisible by 5");
        }else{
            System.out.println("This number is not divisible by 5");
        }
        sc.close();
    }
}
