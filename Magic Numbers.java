https://codeforces.com/problemset/problem/320/A


 import java.util.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	    
	       Scanner sc=new Scanner(System.in);
        String s=new String(sc.next());
        s=s.replaceAll("144","*");
        s=s.replaceAll("14","*");
        s=s.replaceAll("1","*");
        s=s.replaceAll("\\*","");
        if(s.equals(""))
            System.out.println("YES");
        else
            System.out.println("NO");
        
	    }
        catch(Exception e) 	{ return; }
	}
}
