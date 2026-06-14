t = int(input())

for i in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(float, input().split()))

    pairList = []
    for j in range(n):
        if b[j] != 0:
            pairList.append((a[j] / b[j], j))
        else:
            pairList.append((float('inf'), j))
    
    pairList.sort()

    resultThing = []
    for ratio, i in pairList:
        resultThing.append(str(i+1))

    print(" ".join(resultThing))