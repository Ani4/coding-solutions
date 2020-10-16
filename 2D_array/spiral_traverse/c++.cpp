#include <iostream>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
	// for getting input from input.txt
	freopen("input.txt", "r", stdin);
	// for writing output to output.txt
	freopen("output.txt", "w", stdout);
#endif

	int r, c;
	cin >> r >> c;
	int arr[r][c];
	for (int i = 0; i < r; ++i)
	{
		for (int j = 0; j < c; ++j)
		{
			cin >> arr[i][j];
		}
	}

	int count = 0;
	int minr = 0,
	    minc = 0,
	    maxr = r - 1,
	    maxc = c - 1;

	while (count < r * c)
	{
		// left

		for (int i = minr, j = minc; i <= maxr; i++)
		{
			cout << arr[i][j] << endl;
			count++;
		}
		minc++;
		// bottom
		for (int i = maxr, j = minc; j <= maxc; j++)
		{
			cout << arr[i][j] << endl;
			count++;
		}
		maxr--;

		// right
		for (int i = maxr, j = maxc; i >= minr; i--)
		{
			cout << arr[i][j] << endl;
			count++;
		}
		maxc--;

		// top
		for (int i = minr, j = maxc; j >= minc; j--)
		{
			cout << arr[i][j] << endl;
			count++;
		}
		minr++;
	}
}