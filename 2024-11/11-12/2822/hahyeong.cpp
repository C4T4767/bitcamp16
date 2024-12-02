#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    pair<int, int> p[8];
    int score;
    for (int i = 0; i < 8; i++)
    {
        cin >> score;
        p[i] = {score, i + 1};
    }
    sort(p, p + 8);
    int sum = 0;
    vector<int> v;
    for (int i = 7; i >= 3; i--)
    {
        sum += p[i].first;
        v.push_back(p[i].second);
    }
    sort(v.begin(), v.end());
    cout << sum << '\n';
    for (int i = 0; i < 5; i++)
        cout << v[i] << " ";
}