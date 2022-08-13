 //it is a question of algebra So lets try to find an equation for a??

//Equation => 2*a+2*b+a*b = x
              //add '-2b' both side
              //2*a + 2*b + a*b - 2*b = x - 2*b
              //2*a + a*b = x - 2*b
              //a(2+b) = x - 2*b
              //a = (x - 2*b) % a(2+b)


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
		
		while(t>0){
		    int x = sc.nextInt();
		    int a=0;
		    for(int i=1;i*i<=x;i++){
		        if((x-2*i) % (i+2) == 0 && 2*i!=x){  
		            a=1;
		            break;
		        }
		    }
		    if(a==1){
		        System.out.println("YES");
		    }
		    if(a==0){
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
