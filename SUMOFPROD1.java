/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long find(int n,int[] a)
    {
        long sum=0,ans=0;
		for(int k=0;k<n;k++)
		{
		    if(a[k]==1)
		    {
		        sum++;
		    }
		    else
		    {
		        ans += (sum*(sum+1)/2); // sum*(sum+1)/2 is used to find the total number of subarray
		        sum=0;
		    }
		}
		ans += (sum*(sum+1)/2);
		return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    
		for(int k=0;k<n;k++)
		{
		    a[k] = sc.nextInt();
		}
		   System.out.println(find(n,a));
		    t--;
		}
	}
}
