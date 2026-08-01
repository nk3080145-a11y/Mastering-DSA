import java.util.Scanner;

public class SumOfAllSubstringOfANo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0 ;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String sb = s.substring(i,j+1);
                sum += Integer.parseInt(sb);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
