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

	int d = 0;
	int i = 0, j = 0;
	while (i >= 0 && i < r && j >= 0 && j < c)
	{
		d = (d + arr[i][j]) % 4;

		switch (d)
		{
		case 0:
			cout << "e->";
			j++;
			break;

		case 1:
			cout << "s->";
			i++;
			break;

		case 2:
			cout << "w->";
			j--;
			break;

		case 3:
			cout << "n->";
			i--;
			break;
		}
	}

	cout << "EXIT at " << endl
	     << (i < 0 ? i + 1 : i > r ? i % r : i) << " " << (j < 0 ? j + 1 : j > c ? j % c : j);
}