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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int n = sc.nextInt();
		    int r = sc.nextInt();
		    
		    if(r/y >= n){System.out.println("0 "+n);}
		    else if(r/x<n){System.out.println("-1");} // he can't buy burgers 
		    else{
		       int a = (r-(y*n))/(x-y);
		        if((r-(y*n))%(x-y)!=0)
		        {
		            a=a+1;
		        }
		        System.out.println(a+" "+(n-a));
		    }
		    t--;
		}
	}
}
