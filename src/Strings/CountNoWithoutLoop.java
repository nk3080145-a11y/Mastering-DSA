import java.util.Scanner;

public class CountNoWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s.length());
        sc.close();
    }
}
