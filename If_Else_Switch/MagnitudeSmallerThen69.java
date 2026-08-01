import java.util.Scanner;
public class MagnitudeSmallerThen69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n<0){
            n = -n;
        }
        if(n<69){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
