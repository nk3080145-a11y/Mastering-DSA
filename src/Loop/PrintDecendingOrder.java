import java.util.Scanner;
public class PrintDecendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
