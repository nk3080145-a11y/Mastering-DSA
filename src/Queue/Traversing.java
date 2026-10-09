package src.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Traversing {
    public static void display(Queue<Integer> q){
        int n = q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void add(Queue<Integer> q , int val , int idx){
        int n = q.size();
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=0;i<n-idx;i++){
            q.add(q.remove());
        }
    }
    public static int peek(Queue<Integer> q){
        if(q.isEmpty()) return -1;
        return q.peek();
    }
    public static void remove(Queue<Integer> q, int idx){
        int n = q.size();
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        q.remove();
        for(int i=0;i<n-idx-1;i++){
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        add(q,9 , 1);
        display(q);
        remove(q,1);
        display(q);

    }
}
