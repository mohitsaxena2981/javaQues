
import java.util.*;
public class Main
{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head;
    public static Node tail;
    
    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertatbeg(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head=tail=nn;
            return;
        }
        nn.next=head;
        head=nn;
    }
    public static void remove(int k)
    {
        
        int size=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        if(size==k)
        {
            head=head.next;
            return;
        }
        
        int i=1;
        Node prev=head;
        while(i<size-k)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int x=0;x<n;x++)
            {
                insertatbeg(sc.nextInt());
            }
            print();
            System.out.println("REVERSE");
            remove(1);
            print();
    }
}

