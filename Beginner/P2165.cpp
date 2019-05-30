#include <bits/stdc++.h>

using namespace std;

int main(int argc, char const *argv[])
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string s;
    getline(cin, s);
    if (s.length() <= 140)
        puts("TWEET");
    else
        puts("MUTE");
    return 0;
}
