/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int sol=0;
		    if(a<=3)
		    {
		        sol = a*b;
		    }
		    else{
		        int brk = a/3;
		        if(a%3==0)
		        {
		            sol = (brk-1)*c + a*b;
		        }
		        else
		        sol = brk*c + a*b;
		    }
		     System.out.println(sol);
		  
		    t--;
		}
	}
}
