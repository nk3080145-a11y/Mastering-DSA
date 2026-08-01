import java.util.Scanner ;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        System.out.print("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a + " is Greater");
        }
        else if(b>=a && b>=c){
            System.out.println(b + " is Greater");
        }
        else{
            System.out.println(c + " is greater");
        }
        sc.close();
    }
}
