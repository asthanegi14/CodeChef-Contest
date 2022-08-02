/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    
		    int arr[]=new int[x];
		    for(int i=0;i<x;i++) {
		    	arr[i]=sc.nextInt();
		    }
		    int sum0=0;
		    for(int i=0;i<x;i++) {
		    	sum0=arr[i]+sum0;
		    }
		    int mrr[]=new int[x];
		    
		    for(int i=0;i<x;i++) {
		    	int k=0;
		    	if((arr[i]-z)>-1) {
		    		k=(arr[i]-z);
		    	}else {
		    		k=0;
		    	}
		    	mrr[i]=k;
		    }
		    int sum=0;
		    for(int i=0;i<x;i++) {
		    	 sum=sum+mrr[i];
		    	
		    }
		    
		    int sum2=y+sum;
		    if(sum2<sum0) {
		    	System.out.println("COUPON");
		    }else {
		    	System.out.println("NO COUPON");
		    }
		    
		    
		    n--;
		}
		}
	}
