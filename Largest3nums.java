// find largest 3 numbers in an array
import java.util.Scanner;

public class Largest3nums{

	public static void main(String[] args) {
		// Scanner class to take
		// values from console
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n = sc.nextInt();
		 if(n<3)
		    {
			System.out.println("invalid");
		    }
		 
		int[] arr = new int[n];
		System.out.println("enter elements");
		for (int k = 0; k < n; k++) {
			arr[k] = sc.nextInt();
		}
		
		int a,b,c;
		a=b=c=-1;
	   
	    for (int k = 0; k < n; k++)
	    {
	    	if(arr[k]>a)
	    	{
	    		c=b;
	    		b=a;
	    		a=arr[k];
	    	}
	    	else if(arr[k]>b)
	    	{
	    		c=b;
	    		b=arr[k];
	    	}
	    	else if(arr[k]>c)
	    	{
	    		c=arr[k];
	    	}
	    }
	    System.out.println("largest 3 nums are: "+a+" "+b+" "+c);
		
		
	
		
	}
}