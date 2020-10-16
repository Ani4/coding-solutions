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
	int rotation;
	cin >> rotation;

	switch (rotation % 4)
	{
	case 1:
		for (int j = 0; j < c; j++)
		{
			for (int i = r - 1; i >= 0; --i)
			{
				cout << arr[i][j] << " ";
			}
			cout << endl;
		}
		break;
	case 2:
		for (int i = r - 1; i >= 0; --i)
		{
			for (int j = c - 1; j >= 0; --j)
			{
				cout << arr[i][j] << " ";
			}
			cout << endl;
		}
		break;
	case 3:
		for (int j = c - 1; j >= 0; --j)
		{
			for (int i = 0; i < r; ++i)
			{
				cout << arr[i][j] << " ";
			}
			cout << endl;
		}
		break;
	default:
		for (int i = 0; i < r; ++i)
		{
			for (int j = 0; j < c; ++j)
			{
				cout << arr[i][j] << " ";
			}
			cout << endl;
		}
		break;
	}
}