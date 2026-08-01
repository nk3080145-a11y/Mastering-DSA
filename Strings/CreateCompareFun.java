import java.util.Scanner;
public class CreateCompareFun{
    public static int compareTo(String a , String b){
        int minLength;
        if(a.length()<b.length()) minLength = a.length();
        else minLength = b.length();
        for(int i = 0 ; i < minLength ; i++){
            if(a.charAt(i)!=b.charAt(i)) return a.charAt(i)-b.charAt(i);
        }
        return a.length()-b.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String a = sc.nextLine();
        System.out.print("Enter second String : ");
        String b = sc.nextLine();
        System.out.println(compareTo(a,b));
        sc.close();
    }
}