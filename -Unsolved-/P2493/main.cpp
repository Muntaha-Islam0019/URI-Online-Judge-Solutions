#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {

    string line;
    while (getline(cin, line)) {

        int n = 0;
        cin >> n;

        int testCases = n;
        while (testCases > 0) {

            int i = 0;
            string arr[n];

            while (i < n) {

                string solution;

                int firstValue, secondValue, thirdValue;
                scanf("%d %d=%d", &firstValue, &secondValue, &thirdValue);

                if (firstValue + secondValue == thirdValue) solution = "+";
                else if (firstValue - secondValue == thirdValue) solution = "-";
                else solution = "*";

                arr[i] = solution;

                i++;
            }

            int j = 0;
            vector<string> rightPeople;

            int k = 0;
            while (j < n) {

                int questionNumber;
                string name, operatorName;
                cin >> name >> questionNumber >> operatorName;

                if (arr[questionNumber] == operatorName) rightPeople.assign(k++, name);

                i++;
            }

            if (rightPeople.size() == n) cout << "You Shall All Pass!" << endl;
            else if (rightPeople.empty()) cout << "None Shall Pass!" << endl;
            else {

                sort(rightPeople.begin(), rightPeople.end());

                for (auto const &item: rightPeople) {
                    std::cout << item << " ";
                }
            }

            --testCases;
        }
    }
}