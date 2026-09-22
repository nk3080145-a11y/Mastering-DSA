package src.Stack;
import java.util.Stack;
public class StackFun {
    public static int peekAt(Stack<Integer> str, int idx){
        Stack<Integer> str2 = new Stack<>();
        while(str.size()>idx+1){
            str2.push(str.pop());
        }
        int ans = str.peek();
        while(!str2.isEmpty()){
            str.push(str2.pop());
        }
        return ans;
    }
    public static void pushAt(Stack<Integer> str , int idx , int val){
        Stack<Integer> str2 = new Stack<>();
        while(str.size()>idx){
            str2.push(str.pop());
        }
        str.push(val);
        while(!str2.isEmpty()) str.push(str2.pop());
    }
    public static void popAt(Stack<Integer> str, int idx){
        Stack<Integer> str2 = new Stack<>();
        while(str.size()>idx){
            str2.push(str.pop());
        }
        str2.pop();
        while(!str2.isEmpty()){
            str.push(str2.pop());
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
        System.out.println(peekAt(st,2));
        pushAt(st,2,100);
        System.out.println(peekAt(st,2));
        popAt(st,2);
        System.out.println(peekAt(st, 2));
    }
}
