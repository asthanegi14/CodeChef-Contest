/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void find(long[] a, long clr){
        for(int i=0;i<3;i++){
		        if(a[i]!=0){
		            a[i]--;clr++;
		        }
		    }
		    for(int i=0;i<3;i++){
		        for(int j=i+1;j<3;j++){
		            if(a[i]>a[j]){
		                long temp = a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		        }
		    }
		    if(a[0]>=2){
		        System.out.println(clr+3);
		        return;
		    }
		    if(a[0]==1){
		        if(a[2]>=2){
    		        System.out.println(clr+2);
    		        return;
		        }
		        else{
    		        System.out.println(clr+1);
    		        return;
		        }
		    }
		    if(a[1]==0){
		        
		        System.out.println(clr);
		    }
		    else{
		        System.out.println(clr+1);
		    }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
	
		    long a[] = new long[3];
		    long clr=0;
		    for(int i=0;i<3;i++){
		        a[i] = sc.nextLong();
		    }
		    find(a,clr);
		    
		}
	}
}
