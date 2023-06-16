/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Akhil
 */
public class LinkedList
{
    
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    public void insertBeg(int val) 
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertEnd(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
            head=newNode;
        else
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    
    void deleteNode(int data)
    {
        if(head==null)
        {
            System.out.println("The linked list is empty");
            return;
        }
        if(head.data==data)
        {
            head=head.next;
            return;
        }
        Node current=head;
        Node prev=null;
        while(current!=null && current.data!=data)
        {
            prev=current;
            current=current.next;
        }
        if(current==null)
        {
            System.out.println("Value does not exist");
            return;
        }
        prev.next=current.next;
    }
    
    public void display() 
    {
        if (head == null) 
        {
            System.out.println("The linked list is empty!");
            return;
        }
        Node current = head;
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.insertBeg(1);
        list.insertBeg(2);
        list.insertBeg(3);
        list.display();
        list.insertEnd(5);
        list.display();
        list.deleteNode(2);
        list.display();
    }
}

