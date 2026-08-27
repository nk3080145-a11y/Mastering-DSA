public class LoopAndSayPattern {
    public static void main(String[] args) {
        String s = "1211"; //111221
        String ans = "";
        int i=0,j=0;
        while(i<s.length()){
            if(j==s.length() || s.charAt(i)!=s.charAt(j)){
                ans = ans+(j-i);
                ans = ans+s.charAt(i);
                i = j;
            }
            else if(s.charAt(i)==s.charAt(j)) j++;
        }
        System.out.println(ans);
    }
}
