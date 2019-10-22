#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    char t;
    double N[12][12];
    double sum = 0.0;

    std::cin >> t;

    for(int i = 0; i < 12; i++)
    {
        for(int j = 0; j < 12; j++)
        {
            std::cin >> N[i][j];
            if(j > i && (j+i) < 11)
            {
                sum += N[i][j];
            }
        }
    }

    if(t == 'S')
        printf("%.1f\n", sum);
    else
        printf("%.1f\n", sum/66.0);
    return 0;
}
