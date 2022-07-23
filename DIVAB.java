/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int find(int x, int y, int z)
    {
        int i=z;
        if(x%y==0){
            return -1;
        }
	    if(i%x != 0)
		{
		    i = z+x-(z%x);
		}
		while(!(i%x==0 && i%y!=0))
		{
		    i+=x;//now on all the factors of x will be check
		}
		return i;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    System.out.println(find(x,y,z));
		 t--;   
		}
	}
}
