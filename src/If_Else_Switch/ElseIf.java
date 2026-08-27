import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n%5==0 && n%3==0) System.out.println("Apurva");
        else if(n%3==0) System.out.println("Banu");
        else if(n%5==0) System.out.println("Riya");
        else System.out.println("Isha");
        sc.close();
    }
}
