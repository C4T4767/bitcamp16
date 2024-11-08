#include <bits/stdc++.h>
using namespace std;

bool board[105][105];

int main()
{
    int x1, x2, y1, y2;
    for (int i = 0; i < 4; i++)
    {
        cin >> x1 >> y1 >> x2 >> y2;
        for (int x = x1; x < x2; x++)
        {
            for (int y = y1; y < y2; y++)
                board[x][y] = true;
        }
    }
    int area = 0;
    for (int i = 0; i < 105; i++)
    {
        for (int j = 0; j < 105; j++)
        {
            if (board[i][j])
                area++;
        }
    }
    cout << area;
}