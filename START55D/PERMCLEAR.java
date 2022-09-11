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
		
		while(t-->0){
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    
		    ArrayList<Integer> ans= new ArrayList<Integer>();
		    
		    ArrayList<Integer> ans2= new ArrayList<Integer>();
		    
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        ans.add(a[i]);
		    }
		    
		    int m = sc.nextInt();
		    int[] b = new int[m];
		    
		    for(int i=0;i<m;i++){
		        b[i]=sc.nextInt();
		        ans2.add(b[i]);
		    }
		    
		    ans.removeAll(ans2);
		    Object[] ret = ans.toArray();
		    for(Object o:ret){
		        System.out.print(o+" ");
		    }
		    System.out.println();
		}
	}
}
