#include <iostream>
using namespace std;
int find(int x,int y)
{
    int ans=0;
    while(x<y)
    {
        x=x+8;
        ans++;
    }
    return ans;
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,y;
	    cin>>x>>y;
	    cout<<find(x,y)<<endl;
	}
	return 0;
}
