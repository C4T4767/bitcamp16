#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    int a[n], b[n];
    for (int i = 0; i < n; i++)
        cin >> a[i];
    for (int i = 0; i < n; i++)
        cin >> b[i];

    sort(a, a + n);
    int s = 0;
    for (int i = 0; i < n; i++)
    {
        int idx = max_element(b, b + n) - b;
        s += a[i] * b[idx];
        b[idx] = -1;
    }
    cout << s;
}