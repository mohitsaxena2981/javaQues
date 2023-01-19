public class Main
{
    public static void findpermutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        for(int x=0;x<str.length();x++)
        {
            char ch=str.charAt(x);
            findpermutation(str.substring(0,x)+str.substring(x+1),ans+ch);
        }
    }
    public static void main (String[] args) {
        String str="abc";
        findpermutation(str,"");
    }
}

