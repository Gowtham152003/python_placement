n = int(input("Enter the number of rows: "))
k = 1

for i in range(1, n + 1):
    for j in range(1, k + 1):
        print("*", end='')
    for j in range(1, 2 * n - 2 * k + 1):
        print("_", end='')
    for j in range(1, k + 1):
        print("*", end='')
    print()
    k += 1
