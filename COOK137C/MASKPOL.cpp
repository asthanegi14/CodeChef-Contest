#include<iostream>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, a;  // n= total members , a = infected members
        cin>>n>>a;
        
        
        int d;
        d = n - a ;
        
        if(d<=a)
        {
            cout<<d<<endl;
        }
        else
        {
            cout<<a<<endl;
        }
    }
}
