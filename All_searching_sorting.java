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


