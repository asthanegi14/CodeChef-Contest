#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,y,ans;
	    cin>>x>>y;
	    
	    if(y>x)
	        ans = y-x;
	   else
	        ans = x-y;
	    cout<<ans<<endl;
	}
	return 0;
}
