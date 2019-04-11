#include <bits/stdc++.h>

using namespace std;

int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin>>t;
    int x;
    while(t>0)
    {
        cin>>x;
        if(x%2==0)
            cout<<0<<endl;
        else
            cout<<1<<endl;
        t--;
    }

    return 0;
}
