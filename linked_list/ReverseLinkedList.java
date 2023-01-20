
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
    public static void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=5;
	    for(int x=0;x<5;x++)
	    {
	        insertatbeg(sc.nextInt());
	    }
	    int key=3;
	    print();
	    reverse();
	    print();
		System.out.println("Hello World");
	}
}
