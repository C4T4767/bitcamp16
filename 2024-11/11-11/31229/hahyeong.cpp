// BOJ 31229: 또 수열 문제야
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;
    int num = 1, cnt = 0;
    while (1)
    {
        cout << num << " ";
        cnt++;
        num += 2;
        if (cnt == N)
            break;
    }
}