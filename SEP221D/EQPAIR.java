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
		    HashMap<Long, Long> fre = new HashMap<>();
		    long[] a = new long[n];
		     for(int i=0;i<n;i++){
		         a[i] = sc.nextLong();
		     }
		     for(int i=0;i<n;i++){
		         fre.put(a[i],fre.getOrDefault(a[i],0l)+1l);
		     }
		     long ans=0;
		     for(Map.Entry<Long, Long> m: fre.entrySet()){
		      //   System.out.println(m.getValue());
		         ans += (m.getValue()*(m.getValue()-1))/2;
		     }
		     System.out.println(ans);
		}
	}
}
