import java.util.Scanner;
public class PermutationAndCombination {
    public static int factorial(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int r;
        System.out.print("Enter the n : ");
        n = sc.nextInt();
        System.out.print("Enter r : ");
        r = sc.nextInt();
        int nCr = factorial(n)/((factorial(r)) * (factorial(n-r)));
        int nPr = factorial(n)/factorial(n-r);
        System.out.println("nCr = " + nCr);
        System.out.println("nPr = " + nPr);
        sc.close();
    }
}
