#include <iostream>
#include <math.h>
using namespace std;

int convertN_10toB2(int n, int b2)
{
        int result = 0;
        int temp = 0;
        int count = 1;
        while (n > 0)
        {
                temp = n % b2;
                n /= b2;
                result += temp * count;
                count *= 10;
        }

        return result;
}

int convertN_B1to10(int n, int b1)
{
        int result = 0;
        int temp = 0;
        int count = 0;
        while (n > 0)
        {
                temp = n % 10;
                n /= 10;
                result += temp * pow(b1, count);
                count++;
        }
        return result;
}

int convertN_B1toB2(int n, int b1, int b2)
{
        return convertN_10toB2(convertN_B1to10(n, b1), b2);
}

int main()
{
        int n, b1, b2;
        cin >> n >> b1 >> b2;
        cout << convertN_B1toB2(n, b1, b2);
        return 0;
}
