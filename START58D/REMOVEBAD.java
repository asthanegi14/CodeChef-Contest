import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] fre = new int[26];
		    
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        fre[a[i]]++;
		    }
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<26;i++){
		        if(fre[i]>max){
		            max=fre[i];
		        }
		    }
		    System.out.println(n-max);
		}
	}
}
