#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0), cin.tie(0);

    int arr[9];
    int sum = 0;
    for (int i = 0; i < 9; i++)
    {
        cin >> arr[i];
        sum += arr[i];
    }
    sum -= 100;
    sort(arr, arr + 9);
    int begin = 0, end = 8;
    while (1)
    {
        if (arr[begin] + arr[end] == sum)
            break;
        else if (arr[begin] + arr[end] > sum)
        {
            end--;
            continue;
        }
        else
        {
            begin++;
            continue;
        }
    }
    for (int i = 0; i < 9; i++)
    {
        if ((i == begin) || (i == end))
            continue;
        cout << arr[i] << "\n";
    }
}