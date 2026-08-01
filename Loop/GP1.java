// 1,2,4,8,,,, upto n terms
import java.util.Scanner;
public class GP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            a *= 2;
        }
        sc.close();
    }
}
