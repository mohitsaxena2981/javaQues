// build tree 

/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }
    }
    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        System.out.println(root.data);
    }
}
*/

// preorder


/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }  
        public static void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    

    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        // System.out.println(root.data);
        obj.preorder(root);
    }
}

*/

// post order 

/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }
        public static void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        // System.out.println(root.data);
        obj.postorder(root);
    }
}

*/


// inorder traversal


/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
            
        }
    }
    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        // System.out.println(root.data);
        obj.inorder(root);
    }
}

*/



// levelorder traversal 

/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }
        public static void levelordeer(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode==null)
                {
                    System.out.println("");
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null)
                    {
                        q.add(currNode.right);
                    }
                    
                }
            }
        }
    }
    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        // System.out.println(root.data);
        obj.levelordeer(root);
    }
}

*/

// count nodes of tree

/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }
        public static int nodeCount(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lcount=nodeCount(root.left);
            int rcount=nodeCount(root.right);
            return lcount+rcount+1;
        }
    }
    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        System.out.println(obj.nodeCount(root));
    }
}
*/


// sum of nodes

/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }
        public static int nodesum(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lcount=nodesum(root.left);
            int rcount=nodesum(root.right);
            return lcount+rcount+root.data;
        }
    }
    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        System.out.println(obj.nodesum(root));
    }
}

*/




// diameter
/*
import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;
        }
        public static int height(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lheight=height(root.left);
            int rheight=height(root.right);
            return Math.max(lheight,rheight)+1;
        }
        public static int diametertree(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftDia=diametertree(root.left);
            int leftheight=height(root.left);
            int rightDia=diametertree(root.right);
            int rightheight=diametertree(root.right);
            
            int selfdia=leftheight+rightheight+1;
            return Math.max(selfdia,Math.max(leftDia,rightDia));
        }
    }
    public static void main (String[] args) {
        int nodes[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj=new BinaryTree();
        Node root=obj.buildTree(nodes);
        System.out.println(obj.diametertree(root));
    }
}
*/
