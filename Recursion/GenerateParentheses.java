import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses{
    public static void helper(String s,int n,int left , int right,List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        char l = '(';
        char r = ')';
        if(left==right){
            helper(s+l,n,left-1,right,ans);
        }
        else if(left==0){
            helper(s+r,n,left,right-1,ans);
        }
        else{
            helper(s+l,n,left-1,right,ans);
            helper(s+r,n,left,right-1,ans);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("",n,n,n,ans);
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}