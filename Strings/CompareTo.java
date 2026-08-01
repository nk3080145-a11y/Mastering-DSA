import java.util.Scanner;

public class CompareTo {
    public static int compare(String s1 , String s2){
        int minLength = Integer.MIN_VALUE;
        if(s1.length()<s2.length()) minLength = s1.length();
        else minLength= s2.length();
        for(int i=0;i<minLength;i++){
            if(s1.charAt(i)!=s2.charAt(i)) return s1.charAt(i)-s2.charAt(i);
        }
        return s1.length()-s2.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;
        System.out.print("Enter first String : ");
        s1 = sc.nextLine();
        System.out.print("Enter second String : ");
        s2 = sc.nextLine();
        System.out.println(compare(s1, s2));
        sc.close();
    }
}
