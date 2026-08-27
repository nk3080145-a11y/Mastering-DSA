import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp , sp;
        System.out.print("Enter Cost Prize : ");
        cp = sc.nextInt();
        System.out.print("Enter selling prize : ");
        sp = sc.nextInt();
        if(cp<sp){
            System.out.println("Profit is " + (sp-cp));
        }
        else if(cp==sp){
            System.out.println("No profit and no loss");
        }
        else{
            System.out.println("Loss is " + (cp-sp));
        }
        sc.close();
    }
}
