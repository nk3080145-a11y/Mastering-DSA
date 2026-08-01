// * * * * *
// * * * * *
// * * * * *
import java.util.Scanner;
public class StarRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.print("Enter row : ");
        r = sc.nextInt();
        int c;
        System.out.print("Enter coloum : ");
        c = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}