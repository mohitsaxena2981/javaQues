// bubble sort
// best - (n) ,avg - (n^2) , worst - (n^2)  Space -->  O(1)
/*
import java.util.*;
public class Main{
    public static void main (String[] args) {
        int arr[]=new int[]{5,4,1,2,3};
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr.length-x-1;y++)
            {
                if(arr[y]>arr[y+1])
                {
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
}*/

// selection sort
// best - (n^2) ,avg - (n^2) , worst - (n^2)  Space -->  O(1)

/*
import java.util.*;
public class Main{
    public static void main (String[] args) {
        int arr[]=new int[]{5,4,1,2,3};
        for(int x=0;x<arr.length-1;x++)
        {
            int curr=x;
            for(int y=x+1;y<arr.length;y++)
            {
                if(arr[curr]>arr[y])
                {
                    curr=y;
                }
            }
            int temp=arr[curr];
            arr[curr]=arr[x];
            arr[x]=temp;
        }
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
}
*/

// insertion sort
// best - (n) ,avg - (n^2) , worst - (n^2)  Space -->  O(1)

/*
import java.util.*;
public class Main{
    public static void main (String[] args) {
        int arr[]=new int[]{5,4,1,2,3};
        for(int x=1;x<arr.length;x++)
        {
            int prev=x-1;
            int curr=arr[x];
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
}
*/



// merge sort 
// best - (nlog(n) ,avg - (nlog(n) , worst - (nlog(n))  Space -->  O(n)

/*
import java.util.*;
public class Main{
    public static void mergeSort(int arr[],int temp[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,temp,si,mid);
        mergeSort(arr,temp,mid+1,ei);
        merge(arr,temp,si,mid,ei);
    }
    public static void merge(int arr[],int temp[],int si,int mid,int ei)
    {
      
        for(int x=si;x<=ei;x++)
        {
            temp[x]=arr[x];
        }
        int i=si;
        int j=mid+1;
        int k=si;
        while(i<=mid && j<=ei)
        {
            if(temp[i]<=temp[j])
            {
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            arr[k]=temp[i];
            i++;
            k++;
        }
    }
    public static void main (String[] args) {
        int arr[]=new int[]{4,3,1,2,5,6};
        mergeSort(arr,new int[arr.length],0,arr.length-1);
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
}*/

// quick sort 
// best - (nlog(n) ,avg - (nlog(n) , worst - (n^2)  Space -->  O(n)

/*
import java.util.*;
public class Main{
    public static void main (String[] args) {
        int arr[]=new int[]{3,2,4,5,1,6};
        sort(arr,0,arr.length);
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
    
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei-1];
        int i=si;
        int j=si;
        while(i<ei)
        {
            if(arr[i]<=pivot)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void sort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int p=partition(arr,si,ei);
        sort(arr,si,p);
        sort(arr,p+1,ei);
    }
}
*/



// radix sort   o(nk) ,o(nk) ,o(nk)    o(n+k) 
/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]=new int[]{123,43,56,7789,2,3,42,1};
		readixsort(arr,arr.length);
		for(int x=0;x<arr.length;x++)
		{
		    System.out.print(arr[x]+" ");
		}
	}
	public static int getmax(int arr[],int n)
	{
	    int largest=Integer.MAX_VALUE;
	    for(int x=0;x<arr.length;x++)
	    {
	        if(arr[x]>largest)
	        {
	            largest=arr[x];
	        }
	    }
	    return largest;
	}
	public static void readixsort(int arr[],int n)
	{
	    int max=getmax(arr,n);
	    for(int place=1;max/place>0;place*=10)
	    {
	        sort(arr,n,place);
	    }
	}
	public static void sort(int arr[],int n,int place)
	{
	    int output[]=new int[arr.length+1];
	    int count[]=new int[10];
	    for(int x=0;x<arr.length;x++)
	    {
	        count[(arr[x]/place)%10]++;
	    }
	    for(int x=1;x<10;x++)
	    {
	        count[x]+=count[x-1];
	    }
	    for(int x=arr.length-1;x>=0;x--)
	    {
	        output[count[(arr[x]/place)%10]-1]=arr[x];
	        count[(arr[x]/place)%10]--;
	    }
	    for(int x=0;x<arr.length;x++)
		{
		    arr[x]=output[x];
		}
	}
}

*/


// heap sort o(nlogn)


/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]=new int[]{123,43,56,7789,2,3,42,1};
		heapsort(arr,arr.length);
		for(int x=0;x<arr.length;x++)
		{
		    System.out.print(arr[x]+" ");
		}
	}
	public static void heapsort(int arr[],int n)
	{
	    for(int x=n/2-1;x>=0;x--)
	    {
	        heapify(arr,x,n);
	    }
	    for(int x=n-1;x>0;x--)
	    {
	        int temp=arr[0];
	        arr[0]=arr[x];
	        arr[x]=temp;
	        heapify(arr,0,x);
	    }
	    
	    
	}
	public static void heapify(int arr[],int x,int n)
	{
	    int largest=x;
	    int l=2*x+1;
	    int r=2*x+2;
	    if(l<n && arr[l]>arr[largest])
	    {
	        largest=l;
	    }
	    if(r<n && arr[r]>arr[largest])
	    {
	        largest=r;
	    }
	    if(largest!=x)
	    {
	        int temp=arr[x];
	        arr[x]=arr[largest];
	        arr[largest]=temp;
	        heapify(arr,largest,n);
	    }
	    
	}
}
*/

// bucket sort  o(n+k)

/*
import java.util.*;
public class Main{
    public static void main (String[] args) {
        float arr[]=new float[]{(float)0.432,(float)0.23,(float)0.562,(float)0.987,(float)0.12};
        bucketsort(arr,arr.length);
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        } 
    }
    
    public static void bucketsort(float arr[],int n)
    {
        if(n<=0)
        
        {
            return;
        }
        Vector<Float> bucket[]=new Vector[n];
        for(int x=0;x<n;x++)
        {
            bucket[x]=new Vector<Float>();
        }
        for(int x=0;x<n;x++)
        {
            float idx=arr[x]*n;
            bucket[(int)(idx)].add(arr[x]);
        }
        int index=0;
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<bucket[x].size();y++)
            {
                arr[index]=bucket[x].get(y);
                index++;
            }
        }
    }
}
*/
