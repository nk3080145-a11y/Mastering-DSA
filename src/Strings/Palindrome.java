import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        int i = 0, j = s.length() - 1, count = 0;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
            }
            else if(s.charAt(i) != s.charAt(j)) break;
            i++;
            j--;
        }
        if (count == (s.length() / 2) && s.length()%2==0)
            System.out.println("This is palindrome");
        else if(count == (s.length() / 2)+1 && s.length()%2!=0)
            System.out.println("This is palindrome");
        else
            System.out.println("This is not palindrome");
        sc.close();
    }
}