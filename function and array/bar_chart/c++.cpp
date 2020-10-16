#include <iostream>
using namespace std;
int find_max(int[]);
int main()
{
        int a;
        cin >> a;
        int ele[a];
        for (int i = 0; i < a; i++)
        {
                cin >> ele[i];
        }
        int max = find_max(ele);
        for (int i = 0; i < max; i++)
        {
                for (int j = 0; j < a; j++)
                {
                        if (max - i - ele[j] - 1 >= 0)
                                cout << "  ";
                        else
                                cout << "* ";
                }
                cout << endl;
        }

        return 0;
}

int find_max(int ele[])
{
        int max = 0;
        size_t s = sizeof(ele);
        for (int i = 0; i < s; i++)
        {
                if (max < ele[i])
                        max = ele[i];
        }
        return max;
}