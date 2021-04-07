//  sum of 2 array in opposite direction
import java.util.Scanner;

public class array_sum_opposite_direction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of elements");
		int n=sc.nextInt();
		
		int[] arr1=new int[n];
		System.out.println("enter elements of 1st array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int[] arr2=new int[n];
		System.out.println("enter elements of 2nd array");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] brr=sum(arr1,arr2,n);
		System.out.println("new array is");
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
		}
	public static int[] sum(int[] br1,int[] br2,int n)
	{ int[] s=new int[n];
	int i=0;
	while(i<br1.length)
	{ 
		 for(int j=br2.length-1;j>=0;j--)
		 {
			s[i]=br1[i]+br2[j];
		    i++;
		 }
		 
	 }
	
		return(s);
	
	}
		}
	