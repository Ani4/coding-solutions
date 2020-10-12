
def main():
    a = int(input("enter first number "))
    b = int(input("enter second number "))
    if(b > a):
        print("pls enter smaller number than ")
        b = int(input())
    print(npr(a, b))


def fact(n):
    if(n < 2):
        return 1
    return fact(n-1)*n


def npr(n, r):
    return fact(n) / fact(n-r)


if __name__ == "__main__":
    main()
