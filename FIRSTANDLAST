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
		while(t>0)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		    int sum = a[0]+a[n-1];
		    for(int i=1;i<n;i++)
		    {
		        sum = Math.max(sum,a[i]+a[i-1]);
		    }
		    System.out.println(sum);
		     t--;
		}
	}
}
