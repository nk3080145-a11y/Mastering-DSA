package OOPS;

import java.util.ArrayList;

class Arraylist{
     int idx = 0;
    private int[] arr = new int[1];
    private void copy(int[] brr , int previousLength){
        for(int i=0;i<previousLength;i++){
            brr[i] = arr[i];
        }
    }
    void push(int val){
        if(idx == arr.length){
            int[] brr = new int[arr.length*2];
            copy(brr,arr.length);
            arr = brr;
        }
        arr[idx++] = val;
    }
    void pushAt(int index,int val){
        int[] brr = new int[idx+1];
        int temp = 0;
        for(int i=0;i<brr.length;i++){
            if(index==i) brr[i] = val;
            else brr[i] = arr[temp++];
        }
        arr = brr;
        idx++;
    }
    void pop(){
        int[] brr = new int[idx-1];
        for(int i=0;i<brr.length;i++){
            brr[i] = arr[i];
        }
        arr = brr;
    }
    void popAt(int index){
        int[] brr = new int[idx-1];
        int temp = 0;
        for(int i=0;i<brr.length;i++){
            if(index == i) {
                brr[i] = arr[temp+1];
                temp += 2;
            }
            else brr[i] = arr[temp++];
        }
        arr = brr;
    }
    int size(){
        return idx;
    }
    int capacity(){
        return arr.length;
    }
    int get(int i) {
        return arr[i];
    }
    int getFirst(){
        return arr[0];
    }
    int getLast(){
        return arr[idx-1];
    }
    void print(){
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
    }
}
class ArraylistDS {
    public static void main(String[] args) {

    }
}