#include <iostream>
using namespace std;
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	   int x,y;
	   cin>>x>>y;
	   int sum = x+y;
	   int t1 = (500-(x*2)) + (1000-(sum*4));
	   int t2 = (1000-(y*4)) + (500-(sum*2));
	   
	   if(t1>t2)
	   {
	       cout<<t1<<endl;
	   }
	   else
	   cout<<t2<<endl;
	}
	return 0;
}
