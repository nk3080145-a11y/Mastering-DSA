import java.util.Scanner;
public class inputFromTheUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double r = sc.nextDouble();
        System.out.println(r);
        sc.close();
    }
}
