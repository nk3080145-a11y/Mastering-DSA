import java.util.Scanner;
public class PrintAbsoluteValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n<0){
            System.out.println(-n);
        }else{
            System.out.println(n);
        }
        sc.close();
    }
}
