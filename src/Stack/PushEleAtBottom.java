package src.Stack;
import java.util.Stack;
public class PushEleAtBottom {
    public static void helper(Stack<Integer> str , int val){
        if(str.isEmpty()){
            str.push(val);
            return;
        }
        int top = str.pop();
        helper(str ,val);
        str.push(top);
    }
    public static void display(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            int top = st.pop();
            System.out.print(top + " ");
            st2.push(top);
        }
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        helper(st,50);
        display(st);
    }
}
