https://codeforces.com/contest/272/problem/A
______________________________________________________________________________________________________________________________________________________
import java.util.*;

public class Main {
    public static void main(String args[]){
        try{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++)
            sum+=sc.nextInt();
        
        int count=0;
        for(int i=1;i<=5;i=i+1)
            if((sum+i)%(n+1)!=1)
                count++;
        
        System.out.println(count);
        }
        catch(Exception e){return;}
    }
}
