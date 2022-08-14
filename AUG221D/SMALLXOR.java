//the commented part will give tle so try using priority queue

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    // public static int[] findSml(int[] a){
    //     int sml=0,ind=0;
		  //  for(int i=0;i<a.length;i++){
		  //      for(int j=i+1;j<a.length;j++){
		  //          if(a[i]<a[j]){
		  //              sml = a[i];
		  //              ind=i;
		  //          }
		  //      }
		  //  }
		  //  int[] index = new int[2];
		  //  index[0]=sml;
		  //  index[1]=ind;
		    
		  //  return index;
    // }
    // public static int findXor(int sml,int x){
    //     int res = 0;
    //     for(int i=31;i>=0;i--){
            
    //         int a1=((sml&(1<<i))==0)?0:1;
    //         int a2=((x&(1<<i))==0)?0:1;
            
    //         int xor = ((a1 & a2)!=0)?0:(a1|a2);
            
    //         res<<=1;
    //         res |= xor;
    //     }
    //     return res;
    // }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int[] a = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    Queue<Integer> p = new PriorityQueue<>();
		    for(int e:a){
		        p.add(e);
		    }
		  //  System.out.println("sml = "+sml);
		    while(y>0){
		        int sml = p.peek();
		        if((sml ^ x)>sml){
		            p.remove();
		            p.add(sml^x);
		            y--;
		        }
		        else{
		            if((y & 1)==0){break;}
		            else{
		                p.remove();
		                p.add(sml^x);
		                break;
		            }
		        }
		      //  int[] sml = findSml(a);
		      //  Arrays.sort(a);
		      //  int sml = a[0];
		      //  int xor = sml ^ x;
		      //  System.out.println("xor = "+xor);
		      //  a[0] = xor;
		    }
		    int i=0;
		    while(!p.isEmpty()){
		        a[i] = p.remove();
		        i++;
		    }
		    for(int j=0;j<a.length;j++){
		        System.out.print(a[j]+" ");
		    }
		    
		        System.out.println();
		    t--;
		}
	}
}
