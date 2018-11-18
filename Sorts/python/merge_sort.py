def merge_sort(list):
    # check if the len is greater then 1
    if len(list) > 1:
        # get the middle point
        middle = len(list) / 2
        # split the list half
        leftHalf = list[:middle]
        rightHalf = list[middle:]
        # call merge sort again on the two half
        merge_sort(leftHalf)
        merge_sort(rightHalf)

        # merge the half together
        merge(list, leftHalf, rightHalf)


def merge(list, leftHalf, rightHalf):
    # now merge them together
    i = 0
    j = 0
    k = 0
    while i < len(leftHalf) and j < len(rightHalf):
        if(leftHalf[i] < rightHalf[j]):
            list[k] = leftHalf[i]
            i += 1
        else:
            list[k] = rightHalf[j]
            j += 1
        k += 1

    # if the leftHalt still have values
    while i < len(leftHalf):
        list[k] = leftHalf[i]
        i += 1
        k += 1
    
    # if the right still have values
    while j < len(rightHalf):
        list[k] = rightHalf[j]
        j += 1
        k += 1


myList = [5, 15, 2, 20, 11, 16, 4, 14, 6, 3, 8]
print("Before: ", myList)
merge_sort(myList)
print("After: ", myList)