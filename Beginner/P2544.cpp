#include <bits/stdc++.h>

using namespace std;

int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int test;

    while(cin >> test)
    {

        int counter = 0;

        while (test != 1)
        {
            test /= 2;
            counter++;
        }

        cout << counter << endl;
    }
}
