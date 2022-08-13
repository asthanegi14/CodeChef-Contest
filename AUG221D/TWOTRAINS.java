import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0){
		    int n = sc.nextInt(); //no. of station
		    int i=0;
		    int total=0, delay=0;
		    int[] a = new int[n];
		    int[] dp = new int[n];
		    
		    a[0]=dp[0]=0;
		    for(i=1;i<a.length;i++){
		        a[i] = sc.nextInt();
		        total += a[i];
		        dp[i] = a[i];
		        a[i] = total;
		    }
		   
		  //  for(i=0;i<dp.length;i++){
		  //      System.out.println("dp = "+dp[i]);
		        
		  //      System.out.println("a = "+a[i]);
		  //  }
		    for(i=0;i<n-1;i++){
		        delay = a[i+1]-dp[i];
		      //   System.out.println("delay = "+delay);
		        if(delay > 0){
		          //  System.out.println("dp[i],dp[i+1]"+dp[i]+" "+dp[i+1]);
		            dp[i+1] = dp[i+1]+delay+dp[i];
		          //  System.out.println("updated = "+dp[i+1]);
		        }
		        else{
		          //  System.out.println("dp[i],dp[i+1]"+dp[i]+" "+dp[i+1]);
		            dp[i+1] = dp[i+1]+dp[i];
		          //  System.out.println("updated = "+dp[i+1]);
		        }
		    }
		    System.out.println(dp[n-1]);
		    t--;
		}
	}
}
