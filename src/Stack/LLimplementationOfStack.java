package src.Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    Node(){}
}
class MyStack{
    Node head;
    int len;
    int peek(){
        if(head==null) {
            System.out.print("Stack is empty!!");
            return -1;
        }
        return head.val;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    int pop(){
        if(head==null) System.out.println("Stack is empty!!");
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
        len++;
    }
    int size(){
        return len;
    }
}
public class LLimplementationOfStack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        System.out.println(st.peek());
    }
}
