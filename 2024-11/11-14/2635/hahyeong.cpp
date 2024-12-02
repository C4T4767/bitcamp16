#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    int mxCnt = 0, mxSecond = 0;
    for (int i = 1; i <= n; i++)
    {
        int a = n, b = i;
        int cnt = 2;
        while (1)
        {
            int num = a - b;
            if (num >= 0)
            {
                cnt++;
                a = b;
                b = num;
            }
            else
                break;
        }
        if (cnt > mxCnt)
        {
            mxCnt = cnt;
            mxSecond = i;
        }
    }

    cout << mxCnt << '\n';
    cout << n << " " << mxSecond << " ";
    int a = n, b = mxSecond;
    while (true)
    {
        int num = a - b;
        if (num >= 0)
        {
            cout << num << " ";
            a = b;
            b = num;
        }
        else
            break;
    }
    // 좀 더 간결하고 깔끔하게 하고싶은데
}