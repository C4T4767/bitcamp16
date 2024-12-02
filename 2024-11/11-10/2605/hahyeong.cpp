#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    vector<int> v;
    for (int i = 1; i <= n; i++)
        v.push_back(i);
    vector<int> ans;
    for (int i = 0; i < n; i++)
    {
        int student = v[i];
        int num;
        cin >> num;
        ans.insert(ans.end() - num, student);
    }
    for (int i = 0; i < n; i++)
        cout << ans[i] << " ";
}