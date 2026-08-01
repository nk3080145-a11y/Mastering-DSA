import java.util.Scanner;
public class GreaterNumUsingLadder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a , b , c ;
        System.out.print("Enter three numbers : ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a>=b){
            if(a>=c){
                System.out.println("A is greater : " + a);
            }
            else{
                System.out.println("C is greater : " + c);
            }
        }
        else{
            if(b>=c){
                System.out.println("B is greater : " + b);
            }
            else{
                System.out.println("C is greater : " + c);
            }
        }
        s.close();
    }
}
