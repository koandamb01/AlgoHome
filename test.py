import collections

list = [1,2,1,3,1,6,2,3,4,7,8]
count = collections.Counter(list)
m = min(count)
print("count: ", count)
print("min: ", m)
