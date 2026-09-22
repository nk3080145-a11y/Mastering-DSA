package src.Stack;
import java.util.Stack;

public class ReverseStackRecursively {
    public static void pushAtBottom(Stack<Integer> str , int val){
        if(str.isEmpty()){
            str.push(val);
            return;
        }
        int top = str.pop();
        pushAtBottom(str , val);
        str.push(top);
    }
    public static void reverse(Stack<Integer> str){
        if(str.size()==1) return;
        int top = str.pop();
        reverse(str);
        pushAtBottom(str,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
