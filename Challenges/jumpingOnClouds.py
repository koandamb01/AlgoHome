def jumpingOnClouds(c):
    i = 0
    jumps = 0

    while i < len(c) - 1:
        c[i] = int(c[i])
        if i+2 <= len(c) - 1 and c[i+2] == 0:
            jumps += 1
            i += 2
            
        elif c[i+1] == 0:
            jumps += 1
            i += 1
        else:
            i += 1
    print("jumps: ", jumps)

mystr = "0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 0 0 0 1 0 0 1 0 0 1 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0 0 0 0 0 0 1 0 0 0"
arr = mystr.split(' ')
print(map(lambda x: int(x), arr))
jumpingOnClouds(map(lambda x: int(x), arr))

# jumpingOnClouds([0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 0 0 0 1 0 0 1 0 0 1 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0 0 0 0 0 0 1 0 0 0])