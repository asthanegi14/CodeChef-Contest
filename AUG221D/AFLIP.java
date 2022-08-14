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
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    if(m==1||n==1){
    		    int[][] mat = new int[m][n];
    		    int[][] mat2 = new int[m][n];
		        
    		    boolean res = true;
    		    
    		    for(int i=0;i<m;i++){
    		        for(int j=0;j<n;j++){
    		            mat[i][j] = sc.nextInt();
    		        }
    		    }
    		    for(int i=0;i<m;i++){
    		        for(int j=0;j<n;j++){
    		            mat2[i][j] = sc.nextInt();
    		        }
    		    }
    		    for(int i=0;i<m;i++){
    		        for(int j=0;j<n;j++){
    		            if(mat[i][j] != mat2[i][j])
    		                res = false;
    		        }
    		    }
    		    if(res)
    		        System.out.println("YES");
    		    else
    		        System.out.println("NO");
    		    continue;
		    }
		    HashMap<Integer, Integer> a1 = new HashMap<>();
            HashMap<Integer, Integer> a2 = new HashMap<>();
            HashMap<Integer, Integer> b1 = new HashMap<>();
            HashMap<Integer, Integer> b2 = new HashMap<>();
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int x = sc.nextInt();
                    if(((i+j)&1) == 0){
                        a1.put(x, a1.getOrDefault(x,0)+1);
                        // a2.put(x, a2.getOrDefault(x,0)+1);
                    }
                    else{
                        b1.put(x, b1.getOrDefault(x,0)+1);
                        // b2.put(x, b2.getOrDefault(x,0)+1);
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int x = sc.nextInt();
                    if(((i+j)&1) == 0){
                        // a1.put(x, a1.getOrDefault(x,0)+1);
                        a2.put(x, a2.getOrDefault(x,0)+1);
                    }
                    else{
                        // b1.put(x, b1.getOrDefault(x,0)+1);
                        b2.put(x, b2.getOrDefault(x,0)+1);
                    }
                }
            }
    		boolean res = true;
            for(Map.Entry<Integer, Integer> ks : a1.entrySet()){
                if(ks.getValue() != a2.getOrDefault(ks.getKey(),0)){
                    res = false;
                    break;
                }
            }
            
            for(Map.Entry<Integer, Integer> ks : b1.entrySet()){
                if(ks.getValue() != b2.getOrDefault(ks.getKey(),0)){
                    res = false;
                    break;
                }
            }
		    if(res){
    		    System.out.println("YES");
    		}
    		else{
    		    System.out.println("NO");
    		}
		}
	}
}
