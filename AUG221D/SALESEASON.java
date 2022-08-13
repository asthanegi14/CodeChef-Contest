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
		while(t>0){
		    
		    int n = sc.nextInt();
		    
		    if(n<=100){
		        System.out.println(n);
		    }
		    if(100< n && n <= 1000){
		        System.out.println(n-25);
		    }
		    if(1000 < n && n <= 5000){
		        System.out.println(n-100);
		    }
		    if(n>5000){
		        System.out.println(n-500);
		    }
		    t--;
		}
	}
}
