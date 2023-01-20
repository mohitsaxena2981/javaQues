
public class Main{
    static String combo[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void findcombination(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        int pos=ch-'0';
        String key=combo[pos];
        for(int x=0;x<key.length();x++)
        {
            findcombination(str.substring(1),ans+key.charAt(x));
        }
    }
    public static void main (String[] args) {
        String str="23";
        findcombination(str,"");
    }
}
