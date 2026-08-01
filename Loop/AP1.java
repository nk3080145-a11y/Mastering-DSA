// 2,5,8,11, upto n
import java.util.Scanner;
public class AP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int a = 2;
        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            a += 3;
        }
        sc.close();
    }
}
