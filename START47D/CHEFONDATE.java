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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(y<=x)
		    {
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		    t--;
		}
	}
}
