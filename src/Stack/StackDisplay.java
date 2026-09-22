package src.Stack;

import java.util.Stack;
public class StackDisplay {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            int top = st.pop();
            System.out.print(top + " ");
            st2.push(top);
        }
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        System.out.println();
        System.out.println(st.peek());
    }
}
