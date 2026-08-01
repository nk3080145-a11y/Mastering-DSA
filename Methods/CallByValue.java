// import java.util.Scanner;
public class CallByValue {
    public static void change(int x){
        x = 10;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
//Because in call by value we are pass the copy of the original value not original value
// It means x variable in main function and x variable in change function are different