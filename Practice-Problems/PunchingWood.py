t = int(input("num of test cases: "))

for i in range(t):
    n = int(input("num: "))
    v = min(36, ((n + 63) // 64))
    print(v)