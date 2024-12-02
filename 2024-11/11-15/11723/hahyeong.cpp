#include <bits/stdc++.h>
using namespace std;

bool s[20];

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int m;
    cin >> m;
    for (int i = 0; i < m; i++)
    {
        string str;
        cin >> str;
        if (str.compare("add") == 0)
        {
            int x;
            cin >> x;
            if (!s[x - 1])
                s[x - 1] = true;
        }
        else if (str.compare("remove") == 0)
        {
            int x;
            cin >> x;
            if (s[x - 1])
                s[x - 1] = false;
        }
        else if (str.compare("check") == 0)
        {
            int x;
            cin >> x;
            if (s[x - 1])
                cout << 1 << '\n';
            else
                cout << 0 << '\n';
        }
        else if (str.compare("toggle") == 0)
        {
            int x;
            cin >> x;
            s[x - 1] = !s[x - 1];
        }
        else if (str.compare("all") == 0)
        {
            fill(s, s + 20, true);
        }
        else
        { // empty
            fill(s, s + 20, false);
        }
    }
}