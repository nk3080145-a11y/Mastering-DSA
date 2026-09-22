package src.LinkList;
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void display(){
        ListNode temp = head;
        if(head==null){
            return;
        }
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        if(temp==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void insertAt(int val , int idx){
        ListNode temp = new ListNode(val);
        if(idx<0 && idx>size) {
            System.out.println("Invalid index");
            return;
        }
        else if(idx==0) {
            insertAtHead(val);
            return;
        }
        else if(idx == size) {
            insertAtTail(val);
            return;
        }
        ListNode t = head;
        int i = 0;
        while(i<idx-1){
            t = t.next;
            i++;
        }
        temp.next = t.next;
        t.next.prev = temp;
        t.next = temp;
        temp.prev = t;
        size++;
    }
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null){
            head = tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            temp.next = null;
            tail = temp;
        }
        size++;
    }
    void deleteAt(int idx){
        if(idx<0 || idx>size){
            System.out.print("Invalid index");
            return;
        }
        else if(idx==0){
            deleteAtHead();
            return;
        }
        else if(idx==size-1){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        if(temp.next!=null){
            temp.next.prev = temp;
        }
        size--;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(head==null) return;
        else if(size==1){
            head = tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
}
public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.display();
        dll.displayReverse();
        dll.deleteAtHead();
        dll.display();
    }
}
