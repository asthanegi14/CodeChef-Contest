#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n; // here n is the number of bit
	    if(n%4==0) // coz the group of 4 bit is called good nibble othervise it is not good
	    {
	        cout<<"Good\n";
	    }
	    else
	    {
	        cout<<"Not Good\n";
	    }
	}
	return 0;
}
