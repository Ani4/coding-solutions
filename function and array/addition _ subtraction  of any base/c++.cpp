#include <iostream>
using namespace std;

float fact(int n)
{
        if (n < 2)
                return 1;
        return fact(n - 1) * n;
}
float npr(int n, int r)
{
        return fact(n) / fact(n - r);
}

int main()
{
        // Write your code here
        int a, b;
        cin >> a >> b;
        while (b > a)
        {
                cout << "pls enter the smaller number than" << a << endl;
                cin >> b;
        }
        cout << (npr(a, b));
        return 0;
}