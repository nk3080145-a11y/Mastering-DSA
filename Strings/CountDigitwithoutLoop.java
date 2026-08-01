import java.util.Scanner;

public class CountDigitwithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s.length());
        sc.close();
    }
}
