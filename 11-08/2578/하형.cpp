#include <bits/stdc++.h>
using namespace std;

#define X first
#define Y second

bool bingoBoard[5][5];

bool rowCheck(int x)
{
    for (int i = 0; i < 5; i++)
    {
        if (!bingoBoard[x][i])
            return false;
    }
    return true;
}

bool columnCheck(int y)
{
    for (int i = 0; i < 5; i++)
    {
        if (!bingoBoard[i][y])
            return false;
    }
    return true;
}

bool diagonalOneCheck()
{ // x == y
    for (int i = 0; i < 5; i++)
    {
        if (!bingoBoard[i][i])
            return false;
    }
    return true;
}

bool diagonalTwoCheck()
{ // x+y == 4
    for (int i = 0; i < 5; i++)
    {
        if (!bingoBoard[i][4 - i])
            return false;
    }
    return true;
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    map<int, pair<int, int>> board;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            int num;
            cin >> num;
            board.insert({num, {i, j}});
        }
    }
    int cnt = 0;
    int bingo = 0;
    while (1)
    {
        int num;
        cin >> num;
        cnt++;
        int x = board[num].X;
        int y = board[num].Y;
        bingoBoard[x][y] = true;
        if (rowCheck(x))
            bingo++;
        if (columnCheck(y))
            bingo++;
        if (x == y && diagonalOneCheck())
            bingo++;
        if (x + y == 4 && diagonalTwoCheck())
            bingo++;
        if (bingo >= 3)
            break;
    }
    cout << cnt;
}