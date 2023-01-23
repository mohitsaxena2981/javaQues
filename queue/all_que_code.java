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

    
