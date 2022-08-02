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
		int t = sc.nextInt();
		while(t>0)
		{	
		    int max1=0,max2=0;
		    int a[]=new int[2];
		    for(int i=0;i<2;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		   int a2[]=new int[2];
		    for(int i=0;i<2;i++)
		    {
		        a2[i]=sc.nextInt();
		    }
		    if(a[0]<a[1])
		    {
		        max1=a[1];
		    }
		    else
		    max1=a[0];
		    
		    if(a2[0]<a2[1])
		    {
		        max2=a2[1];
		    }
		    else
		    max2=a2[0];
		    
		    if(max1>max2)
		    {
		        System.out.println("Q");
		    }
		    else if(max1<max2)
		        System.out.println("P");
		    else 
		        System.out.println("TIE");
		    t--;
		}
	
	}
}
