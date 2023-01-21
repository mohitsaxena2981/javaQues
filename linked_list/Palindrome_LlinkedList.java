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
    
    public static boolean ispalin()
    {
        // find middle node
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node curr=slow;
        Node next;
        // reverse nex thalf
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // check for pallin
        
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(right.data!=left.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            insertatbeg(sc.nextInt());
        }
        System.out.println(ispalin());
    }
}
