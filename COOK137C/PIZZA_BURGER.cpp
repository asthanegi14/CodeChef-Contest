#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,y,z;  // x = total rupees , y = price of pizza, z = price of burger
	    cin>>x>>y>>z;
	    
	    if(x>=y && x>=z)
	    {
	        cout<<"PIZZA\n";
	    }
	    else if(x>=y)
	    {
	        cout<<"PIZZA\n";
	    }
	    else if(x>=z)
	    {
	        cout<<"BURGER\n";
	    }
	    else
	    {
	        cout<<"NOTHING\n";
	    }
	}
	return 0;
}
