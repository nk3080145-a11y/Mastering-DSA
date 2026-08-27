package src.LinkList;

public class BasicSyntax {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);
//        Connect
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        System.out.println(d);
        System.out.println(a.next.next.next);
        System.out.println(b.next.next);
        System.out.println(c.next);
    }
}
