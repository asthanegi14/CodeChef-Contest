import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int count=0;
		    for(int i=s.length()-2;i>=0;i--){
		        if(s.charAt(i)==s.charAt(i+1)){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
