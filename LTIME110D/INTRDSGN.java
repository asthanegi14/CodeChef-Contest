import java.util.*;
import java.lang.*;
import java.io.*;

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
		    int d = sc.nextInt();
		     int oneSum = a+b;
		     int twoSum = c+d;
		     
		     if(oneSum<=twoSum)
		     {
		         System.out.println(oneSum);
		     }
		     else
		     System.out.println(twoSum);
		    t--;
		}
	}
}
