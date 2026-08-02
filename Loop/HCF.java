import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.print("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        int min = 0;
        if(a<b) min = a;
        else min = b;
        int ans = 0;
        for(int i=min;i>0;i--){
            if(a%i==0 && b%i==0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
