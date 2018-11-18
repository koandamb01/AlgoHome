def insertion_sort(list):
    # iterate through the list forward
    for i in range(len(list)):
        # assign j to i
        j = i
        # iterate backward to 0 from j
        while j > 0 and list[j-1] > list[j]:
            temp = list[j-1]
            list[j-1] = list[j]
            list[j] = temp
            j -= 1
            # you can also write the swap this way
            # list[j-1], list[j] = list[j-1], list[j]
    return list

list = [3, 5, 6, 7, 8, 12, 1, 3, 4]
print(insertion_sort(list))