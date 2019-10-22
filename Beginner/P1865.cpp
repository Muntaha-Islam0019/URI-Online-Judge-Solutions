#include <bits/stdc++.h>

using namespace std;

int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string x;
    int n,t;
    cin>>t;
    while(t-->0)
    {
        cin>>x>>n;
        if(x=="Thor")
            cout<<"Y\n";
        else
            cout<<"N\n";
    }

    return 0;
}
