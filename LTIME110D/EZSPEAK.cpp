/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        string s;
        cin>>s;
        int count=0;
        for(int i=0;i<n;i++)
        {
            char c = s[i];
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
		    {
		       count=0;
		    }
		    else
		    {
		      count++;
		      if(count>=4)
		      {
		          break;
		      }
		    }
        }
         if(count>=4)
		    {
		       cout<<"NO"<<endl;
		    }
		    else
		    cout<<"YES"<<endl;
    }

    return 0;
}
