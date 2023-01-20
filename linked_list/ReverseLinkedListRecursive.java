
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
    public static int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;
    }
    public static int recursionFindele(int key)
    {
        return helper(head,key);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=5;
	    for(int x=0;x<5;x++)
	    {
	        insertatbeg(sc.nextInt());
	    }
	    int key=3;
	    System.out.println(recursionFindele(key));
		System.out.println("Hello World");
	}
}
