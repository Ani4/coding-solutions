#include <iostream>
using namespace std;

int main()
{
        int a;
        cin >> a;
        int c[a];
        for (int i = 0; i < a; i++)
        {
                cin >> c[i];
        }
        int min, max;
        min = c[0];
        max = c[0];

        for (int i = 0; i < a; i++)
        {
                if (min > c[i])
                        min = c[i];
                else if (max < c[i])
                        max = c[i];
        }
        cout << max - min;

        return 0;
}