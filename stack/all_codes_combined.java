/// ArrayList


/*
import java.util.*;
public class Main
{
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data)
        {
            list.add(data);
        }
        
        public static int pop()
        {
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        
        public static int peek()
        {
            return list.get(list.size()-1);
        }
    }
	public static void main(String[] args) {
	    Stack s=new Stack();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    while(!s.isEmpty())
	    {
	        System.out.println(s.peek());
	        s.pop();
	    }
		System.out.println("Hello World");
	}
}
*/

// linked list


/*
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
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty()==true)
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        
        public static int pop()
        {
            if(isEmpty()==true)
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        
        public static int peek()
        {
            if(isEmpty()==true)
            {
                return -1;
            }
            return head.data;
        }
    }
	public static void main(String[] args) {
	    Stack s=new Stack();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    while(!s.isEmpty())
	    {
	        System.out.println(s.peek());
	        s.pop();
	    }
		System.out.println("Hello World");
	}
}
*/

// collection framework

/*
import java.util.*;
public class Main{
    public static void main (String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
	    s.push(2);
	    s.push(3);
	    while(!s.isEmpty())
	    {
	        System.out.println(s.peek());
	        s.pop();
	    }
		System.out.println("Hello World");
    }
}

*/


// Que --> Push at the bottom of the Stack  O(n)


/*
import java.util.*;
public class Main{
    public static void pushAtBottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main (String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
	    s.push(2);
	    s.push(3);
	    
	    pushAtBottom(s,4);
	    while(!s.isEmpty())
	    {
	        System.out.println(s.peek());
	        s.pop();
	    }
    }
}

*/


// reverse a string using Stack


/*
import java.util.*;
public class Main{
    public static String reverseString(String str)
    {
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder("");
        while(!s.isEmpty())
        {
            sb.append(s.pop());
            
        }
        return sb.toString();
    }
    public static void main (String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
	    s.push(2);
	    s.push(3);
	    System.out.println(reverseString("abc"));
    }
}
    */
    


// reverse a Stack    O(n)          memory--> O(1)



/*
import java.util.*;
public class Main{
    public static void insertatbottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        insertatbottom(s,data);
        
        s.push(top);
    }
    
    public static void PrintStack(Stack<Integer> s)
    {
        while(!s.isEmpty())
	    {
	        System.out.println(s.peek());
	        s.pop();
	    }
    }
    public static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverseStack(s);
        insertatbottom(s,top);
    }
    public static void main (String[] args) {
        
        Stack<Integer> s=new Stack<>();
        s.push(1);
	    s.push(2);
	    s.push(3);
	    
	    reverseStack(s);
	    System.out.println("After reverse");
	    PrintStack(s);
        
    }
}

*/


 //  Stock Span
 
/* 
 import java.util.*;
 
 public class Main{
     
     public static void stockspan(int stocks[],int span[])
     {
        Stack<Integer> s=new Stack<>();
        s.push(0);
        span[0]=1;
        for(int x=1;x<span.length;x++)
        {
            int curr=stocks[x];
            while(!s.isEmpty() && curr>stocks[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[x]=x+1;
            }
            else
            {
                span[x]=x-s.peek();
            }
            s.push(x);
        }
     }
    public static void main (String[] args) {
        int stocks[]=new int[]{100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockspan(stocks,span);
        for(int x=0;x<stocks.length;x++)
        {
            System.out.print(span[x]+" ");
        }
        
    }
 }
 
 */
 
 
 // next greater element 
 
 
 
 /*
 import java.util.*;
 public class Main{
    public static void main (String[] args) {
        Stack<Integer> s=new Stack<>();
        int arr[]=new int[]{6,8,0,1,3};
        int nxtGreater[]=new int[arr.length];
        
        for(int x=arr.length-1;x>=0;x--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[x]){
                s.pop();
            }
            
            if(s.isEmpty())
            {
                nxtGreater[x]=-1;
                
            }else{
                nxtGreater[x]=arr[s.peek()];
            }
            s.push(x);
        }
        for(int x=0;x<nxtGreater.length;x++)
        {
            System.out.print(nxtGreater[x]+" ");
        }
    }
 }
 
 */
 
 
 
 // valid paranthesis 
 
 
 /*
 import java.util.*;
 public class Main{
     public static boolean valid(String str)
     {
        Stack<Character> s=new Stack<>();
        for(int x=0;x<str.length();x++)
        {
            char ch=str.charAt(x);
            if(ch=='('||ch=='{'||ch=='[')
            {
                s.push(ch);
            }
            else{
                if(s.isEmpty())
                {
                    return false;
                }
                if((str.charAt(x)==')' && s.peek()=='(') || (str.charAt(x)=='}' && s.peek()=='{') || (str.charAt(x)==']' && s.peek()=='[')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
        }
        return false;
     }
    public static void main (String[] args) {
        String str="()";
        System.out.println(valid(str));
    }
 }
 
 */
 
 
 
 // balanced paranthesis
 
 /*
 
 import java.util.*;
 public class Main{
    public static boolean isvalid(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int x=0;x<str.length();x++)
        {
            char ch=str.charAt(x);
            if(ch==')')
            {
                int count=0;
                while(!s.isEmpty() && s.peek()!='(')
                {
                    s.pop();
                    count+=1;
                }
                if(count<1)
                {
                    return true;
                }
                else{
                    s.pop();
                }

            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main (String[] args) {
        String str="((a+b))";
        String str1="(a-b)";
        System.out.println(isvalid(str));
    }
 }
 
 */
 
 // max rectangle area in histogram
 
 
 /*
 import java.util.*;
 public class Main{
    public static int maxArea(int arr[])
    {
        Stack<Integer> s=new Stack<>();
        int msl[]=new int[arr.length];
        int msr[]=new int[arr.length];
        
        // next smaller right
        for(int x=arr.length-1;x>=0;x--)
        {
            while(!s.isEmpty()&& arr[s.peek()]>=arr[x])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                msr[x]=arr.length;
            }
            else{
                msr[x]=s.peek();
            }
            s.push(x);
            
        }
        
        // next smaller left
        
        
        s=new Stack<>();
        for(int x=0;x<arr.length;x++)
        {
            while(!s.isEmpty()&& arr[s.peek()]>=arr[x])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                msl[x]=-1;
            }
            else{
                msl[x]=s.peek();
            }
            s.push(x);
            
        }
        
        // currarea = width: j-i-1 = msr[x]-msr[l]-1;
        int maxarea=0;
        for(int x=0;x<arr.length;x++)
        {
            int currheight=arr[x];
            int currwidth=msr[x]-msl[x]-1;
            int currarea=currheight*currwidth;
            maxarea=Math.max(maxarea,currarea);
        }
        return maxarea;
    }
    public static void main (String[] args) {
        int arr[]=new int[]{2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
 }
 
 */
