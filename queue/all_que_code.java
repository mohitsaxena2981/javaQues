// Array   remove operation time complecity -- > O(n)

// hence we mostly dont use array for queue creation 
/*
import java.util.*;
public class Main{
    static class Queue{
    static int arr[];
    static int size;
    static int rear;
    Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        
    }
    public static boolean isEmpty(){
        return rear==-1;
    }
    // add
    
    public static void add(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear+=1;
        arr[rear]=data;
    }
    //  remove
    
    public static int remove(){
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int front=arr[0];
        for(int x=0;x<rear;x++){
            arr[x]=arr[x+1];
        }
        rear--;
        return front;
    }
    
    //peek
    
    public static int peek(){
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
    }
    public static void main (String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

*/

// circular queue using arrays remove operation time complecity -- > O(1)


/*
import java.util.*;
public class Main{
    static class Queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;
    Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        front=-1;
    }
    public static boolean isEmpty(){
        return rear==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    
    // add
    
    public static void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        //add first element
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    
    //remove
    
    public static int remove(){
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int result=arr[front];
        // last el delete
        if(rear==front)
        {
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
            
        }
        return result;
    }
    
    
    // peek
    public static int peek(){
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    }
        public static void main (String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

*/


// queue using linkedlist

/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        
        // add
        
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        
        // remove
        
        public static int remove(){
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int front=head.data;
        if(tail==head){
            tail=head=null;
        }
        else{
            head=head.next;
            
        }
        return front;
    }
    
    // peek
    public static int peek(){
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
    }
    public static void main (String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/






 // java collection framework time complexity  ->O(1)

/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   // Queue<Integer> q=new LinkedList<>();
	   Queue<Integer> q=new ArrayDeque<>();
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    while(!q.isEmpty())
	    {
	        System.out.println(q.peek());
	        q.remove();
	    }
		System.out.println("Hello World");
	}
}
*/


// Que -->  Queue using 2 stacks


/*
import java.util.*;
public class Main{
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        
        // add -- O(n)
        
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        
        //  remove
        
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        
        
        //  peek
        
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main (String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/


// Que --> Stack using 2 queues


/*
import java.util.*;
public class Main{
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        
        public static void push(int data)
        {
            if(!q1.isEmpty())
            {
                    q1.add(data);
            }
            else
            {
                q2.add(data);
            }
        }
        
        public static int pop(){
            if(isEmpty())
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int top=-1;
            // case1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top=q1.remove();
                    if(q1.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }
            }else{ // case2
                while(!q2.isEmpty())
                {
                    top=q2.remove();
                    if(q2.isEmpty())
                    {
                        break;
                    }
                    q1.add(top);
                }
            
            }
            return top;
        }
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int top=-1;
            // case1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top=q1.remove();
                    q2.add(top);
                }
            }else{ // case2
                while(!q2.isEmpty())
                {
                    top=q2.remove();
                    q1.add(top);
                }
            
            }
        return top;
        }
    }
    public static void main (String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
*/


// Que --> first non repeating letter in a stream of characters
// time complexity O(n);
// stream of characters -->     queue se hoga solve

/*
import java.util.*;
public class Main{
    public static void printNonrepeating(String str)
    {
        int freq[]=new int[26];
        Queue<Character> q=new  LinkedList<>();
        for(int x=0;x<str.length();x++)
        {
            char ch=str.charAt(x);
            q.add(ch);
            freq[ch-'a']++;
            
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                System.out.print("-1"+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println("");
    }
    public static void main (String[] args) {
        String str="aabccxb";
        printNonrepeating(str);
    }
}
*/



// Que --> Interleave 2 halves of a Queue (even length)
// time compplexity --> O(n)

/*
import java.util.*;
public class Main
{
  public static void interleave (Queue < Integer > q)
  {
    Queue < Integer > firsthalf = new LinkedList <> ();
    int size = q.size ();
    for (int x = 0; x < size / 2; x++)
      {
	firsthalf.add (q.remove());
      }
    while (!firsthalf.isEmpty ())
      {
	q.add (firsthalf.remove ());
	q.add (q.remove ());
      }
  }
  public static void main (String[]args)
  {
    Queue < Integer > q = new LinkedList <> ();
    q.add (1);
    q.add (2);
    q.add (3);
    q.add (4);
    q.add (5);
    q.add (6);
    q.add (7);
    q.add(8);
    q.add(9);
    q.add(10);
    interleave(q);
    while(!q.isEmpty())
    {
        System.out.print(q.remove()+" ");
    }

  }

}
*/

    
