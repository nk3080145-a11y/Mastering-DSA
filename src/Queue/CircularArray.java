package src.Queue;
class CircularQueue{
    int[] arr;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }
    int f;
    int r;
    int size;
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is full you can't add more values !!");
            return;
        }
        arr[r++] = val;
        if(r==arr.length) r = 0;
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is empty you can't remove element!");
            return -1;
        }
        int first = arr[f];
        f++;
        if(f==arr.length) f = 0;
        size--;
        return first;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is empty there is no peek!");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size==0){
            System.out.print("Queue is empty");
            return;
        }
        if(f<r){
            for(int i=f;i<r;i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
public class CircularArray {
    public static void main(String[] args) {

    }
}
