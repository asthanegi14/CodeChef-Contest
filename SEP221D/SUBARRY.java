/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t =sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    
		    long ans=Long.MAX_VALUE;
		    long[] a = new long[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextLong();
		    }
		    Arrays.sort(a);
		    
		    long min=Long.MAX_VALUE;
		    long max=Long.MIN_VALUE;
		    
		    max=Math.max(a[0]*a[0],a[n-1]*a[n-1]);
		    
		    if(a[0]<0 && a[n-1]>0){
		        min = a[0]*a[n-1];
		    }
		    else{
		        for(int i=0;i<n;i++){
		            min = Math.min(min,a[i]*a[i]);
		        }
		    }
		    System.out.println(min+" "+max);
		}
	}
}
