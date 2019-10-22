#include <iostream>
#include <map>
#include <algorithm>
#include <vector>
#define ll long long

using namespace std;

bool cmp (const pair<int,int> &a,const pair<int,int> &b) {
    if (a.second > b.second) return true;
    return a.second == b.second && a.first < b.first;
}

int main() {

    ios_base::sync_with_stdio(false);

    ll T;
    cin >> T;

    while (T--) {

        ll N, K;
        cin >> N >> K;

        vector <pair<ll ,ll>> idAndSize;
        int sizeArray = 0;

        while (N--) {

            ll I, H, W, L;
            cin >> I >> H >> W >> L;

            sizeArray++;

            ll size = H * W * L;

            idAndSize.emplace_back(std::make_pair(I, size));
        }

        sort(idAndSize.begin(), idAndSize.end(),cmp);

        vector <ll> vectorForSortingID;

        for(int i=0; i<K; i++)
            vectorForSortingID.push_back(idAndSize[i].first);

        sort(vectorForSortingID.begin(),vectorForSortingID.end());

        printf("%lld", vectorForSortingID[0]);

        for(int i=1; i<K; i++) {
            printf(" %lld", vectorForSortingID[i]);
        }

        printf("\n");
    }
    return 0;
}