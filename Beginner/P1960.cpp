#include <bits/stdc++.h>

using namespace std;

string a[10] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
string b[10] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
string c[10] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
int n;

int main(){
	scanf("%d",&n);
	string res = a[n/100] + b[(n%100)/10] + c[n%10];
	cout << res << endl;
	return 0;
}
