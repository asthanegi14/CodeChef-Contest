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
		int t=sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    long[] a = new long[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextLong();
		    }
		    long[] b = new long[n];
		    for(int i=0;i<n;i++){
		        long max1 = Math.abs(a[i]-1);
		        long max2 = Math.abs(a[i]-m);
		        if(max1<max2){
		            b[i]=m;
		        }
		        else
		        b[i]=1;
		    }
		    long sum=0;
		    for(int i=0;i<n;i++){
		        sum+=Math.abs(a[i]-b[i]);
		    }
		    System.out.println(sum);
		}
	}
}
