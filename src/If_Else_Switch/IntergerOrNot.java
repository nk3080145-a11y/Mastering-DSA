import java.util.Scanner;
public class IntergerOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Enter the number : ");
        n = sc.nextDouble();
        int x = (int)n;
        if(n-x==0){
            System.out.println("Not an interger");
        }else{
            System.out.println("Is an interger");
        }
        sc.close();
    }
}
