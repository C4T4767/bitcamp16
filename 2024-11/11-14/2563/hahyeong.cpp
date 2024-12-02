#include <bits/stdc++.h>
using namespace std;

bool board[105][105];

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        int y;
        cin >> y;
        for (int i = x; i < x + 10; i++)
        {
            for (int j = y; j < y + 10; j++)
                board[i][j] = true;
        }
    }
    int ans = 0;
    for (int i = 0; i < 105; i++)
    {
        for (int j = 0; j < 105; j++)
        {
            if (board[i][j])
                ans++;
        }
    }
    cout << ans;
}