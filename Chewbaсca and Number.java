// Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

// Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

// Input
// The first line contains a single integer x (1 ≤ x ≤ 1018) — the number that Luke Skywalker gave to Chewbacca.

// Output
// Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

// Examples
// inputCopy
// 27
// outputCopy
// 22
// inputCopy
// 4545
// outputCopy
// 4444
_______________________________________________________________________________________________________________________________________________
import java.util.*;
public class Main  {
   
    public static void main(String args[] ) throws Exception {
      
        Scanner sc = new Scanner(System.in);
       try {
         
            ArrayList<Integer> al=new ArrayList<>();
            String str=sc.next();
            int x=str.charAt(0)-'0';
            if(x>=5){
                if(x!=9)
                    al.add(9-x);
                else al.add(x);
            }
            else
            al.add(x);
            for(int i=1;i<str.length();i++){
                x=str.charAt(i)-'0';
                if(x>=5)
                al.add(9-x);
                else
                al.add(x);
            }
            
            for(int i:al)
            System.out.print(i);
            System.out.println();
          
       
       
       } catch(Exception e) {
       }
       

       }
}
