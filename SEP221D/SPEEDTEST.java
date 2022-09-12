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
		while(t-->0){
		    float a = sc.nextInt();
		    float x = sc.nextInt();
		    float b = sc.nextInt();
		    float y = sc.nextInt();
		    
		        float div1 = a/x;
    		    float div2 = b/y;
    		    
    		    if(div1 < div2){
    		        System.out.println("Bob");
    		    }
    		    else if(div1 > div2){
    		        System.out.println("Alice");
    		    }
    		    else{
    		        System.out.println("Equal");
    		    }
		}
	}
}
