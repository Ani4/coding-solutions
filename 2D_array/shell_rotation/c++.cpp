#include <iostream>
using namespace std;

void rotation1d();
void display(int r, int c, int **arr)
{
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; j++)
		{
			cout << *(arr[r] + j) << " ";
		}
		cout << endl;
	}
}
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
	int rotation, shell;
	cin >> rotation >> shell;
	// rotateShell(arr, r, c, shell, rotation);
	display(r, c, (int *)arr);
	return 0;
}

// void rotateShell(int arr[][], int r, int c, int shell, int rotation)
// {
// 	int[] oneD = fillOnedFromShell(arr, r, c, shell);
// 	rotation1d(oneD, sizeof(oneD), rotation);
// 	fillShellFromOned(arr, r, c, shell, oneD);
// }
// void rotation1d(int arr[], int r, int c)
// {
// }