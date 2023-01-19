public class Main{
    public static void main (String[] args) {
    String str="abc";
    subset(str,"",0);
    
    }
    public static void subset(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        
        char ch=str.charAt(i);
        subset(str,ans+ch,i+1);
        subset(str,ans,i+1);
    }
}
