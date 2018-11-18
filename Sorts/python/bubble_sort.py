def bubble_sort(arr):
    # iterate through array foward
    for i in range(len(arr)):
        iswapped = False
        # iterate though array forward till
        for j in range(len(arr) - i - 1):
            # do a check
            if arr[j] > arr[j+1]:
                swapper = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = swapper
                iswapped = True 
        # check if there no swapper, which every element is sort
        if not iswapped:
            return arr
    return arr

print(bubble_sort([5,3,9,11,2,1]))
