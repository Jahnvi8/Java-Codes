// left rotate an array by d positions
import java.util.Scanner;
import java.lang.Math; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class left_rotate_by_d_places {
	
		Scanner sc = new Scanner(System.in);
       static void left_rotate(int ar[]) 
		    { 
		       int n=ar.length;
		       int t=ar[0];
		       for(int i=1;i<n;i++)
		       {
		    	   ar[i-1]=ar[i];
		    	  
		       }
		       ar[n-1]=t;
		    } 
       static void again(int ar[],int d)
       {    
    	   int n=ar.length;
    	   for(int i=0;i<d;i++)
    	   {left_rotate(ar);}
    	   for(int i=0;i<n;i++)
	       { System.out.print(ar[i]+" ");
	       } 
       }
		      
		   
		    public static void main(String args[]) 
		    {    Scanner sc=new Scanner(System.in);
		        System.out.println("enter number of elements");
		        int n = sc.nextInt(); 
		        System.out.println("enter elements");
		        int ar[]=new int[n];
		        for(int i=0;i<n;i++)
		        {
		        	ar[i]=sc.nextInt();
		        }
		        System.out.println("how may rotations?");
	            int d=sc.nextInt();
	            again(ar,d); 
		    } 
		}
