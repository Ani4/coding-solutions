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

	for (int gap = 0; gap < r; gap++)
	{
		for (int i = 0, j = gap; j < c; i++, j++)
		{
			cout << arr[i][j] << endl;
		}
	}
}