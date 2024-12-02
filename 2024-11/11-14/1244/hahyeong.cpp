#include <bits/stdc++.h>
using namespace std;

int n, m;
int status[105];
int student[105][2];

void male(int num)
{
    int idx = num;
    while (idx <= n)
    {
        status[idx] = abs(status[idx] - 1);
        idx += num;
    }
}

void female(int num)
{
    int a = num - 1;
    int b = num + 1;
    while (a >= 1 && b <= n)
    {
        if (status[a] == status[b])
        {
            a--;
            b++;
            continue;
        }
        else
        {
            break;
        }
    }
    for (int i = a + 1; i <= b - 1; i++)
    {
        status[i] = abs(status[i] - 1);
    }
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> n;
    for (int i = 1; i <= n; i++)
        cin >> status[i];
    cin >> m;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < 2; j++)
            cin >> student[i][j];
    }

    for (int i = 0; i < m; i++)
    {
        if (student[i][0] == 1)
            male(student[i][1]);
        else
            female(student[i][1]);
    }

    for (int i = 1; i <= n; i++)
    {
        cout << status[i] << " ";
        if (i % 20 == 0)
            cout << '\n';
    }
}