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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x%2==0)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        if(y%2!=0)
		    {
		        System.out.println("YES");
		    }
		    else
		          System.out.println("NO");
		    }
		     t--;
		}
	}
}
