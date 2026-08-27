import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class PowerSet{
    public static void subset(String temp , String s ,int idx,List<String> ans){
        if (idx==s.length()) {
            if(temp.length()!=0) ans.add(temp);
            return;
        }
        char ch = s.charAt(idx);
        subset(temp+ch,s,idx+1,ans);
        subset(temp,s,idx+1,ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = new ArrayList<String>();
        subset("",s,0,ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}