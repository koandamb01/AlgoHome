def countingValleys(n, s):
    seaLevel = 0
    valeyCount = 0

    for str in s:
        if str == 'U':
            seaLevel += 1
            if seaLevel == 0:
                valeyCount += 1

        elif str == 'D':
            seaLevel -= 1
    return valeyCount
countingValleys(8, "DDUUUUDD")