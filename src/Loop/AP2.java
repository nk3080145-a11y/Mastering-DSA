// 99,95,91,87 upto all terms which are positive
import java.util.Scanner;
public class AP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=99;i>0;i-=4){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
