package src.Queue;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyQueue{
    Node head;
    Node tail;
    int size;
    void add(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int remove(){
        if(head==null) {
            System.out.print("Queue is empty!!");
            return -1;
        }
        int first = head.val;
        head = head.next;
        if(head==null) tail = null;
        size--;
        return first;
    }
    int peek(){
        if(head==null) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        else return head.val;
    }
}
public class LLImplementationOfQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
    }
}
