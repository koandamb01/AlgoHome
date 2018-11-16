import math
[10, 20, 20, 10, 10, 30, 50, 10, 20]
def sockMerchant(arr):
    memo = {}
    for val in arr:
        if val in memo:
            memo[val] += 0.5
        else:
            memo[val] = 0.5
    
    count = 0
    for val in memo.values():
        count += math.floor(val)
    print(count)

sockMerchant([10, 20, 20, 10, 10, 30, 50, 10, 20])