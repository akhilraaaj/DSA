import java.sql.SQLOutput;

public class middleofll {
    static Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertBeg(int val)
    {
        Node newNode = new  Node(val);
        newNode.next = head;
        head = newNode;
    }
    public static int middleele(Node head) {
        Node slowptr=head;
        Node fastptr=head;
        while(fastptr!=null && fastptr.next!=null) {
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr.data;
    }

    public static void main(String[] args) {
        middleofll ll=new middleofll();
        ll.insertBeg(1);
        ll.insertBeg(2);
        ll.insertBeg(3);
        ll.insertBeg(4);
        ll.insertBeg(5);
        int res=middleele(head);
        System.out.println("The middle element is "+res);
    }
}
