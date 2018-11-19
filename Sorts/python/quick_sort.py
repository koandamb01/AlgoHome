def quick_sort(arr, low, high):
    print("low: ", low)
    print("high: ", high)

    if low < high:
        j = partition(arr, low, high)
        quick_sort(arr, low, j)
        quick_sort(arr, j+1, high)


def partition(arr, low, high):
    i = low
    j = high
    pivot = arr[low]

    while i < j:
        while i <= high and arr[i] <= pivot:
            i += 1
        
        while j >= low and arr[j] > pivot:
            j -= 1
        
        if i < j:
            swap(arr, i, j)
    swap(arr, low, j)
    return j
    
def swap(arr, indexOne, indexTwo):
    arr[indexOne], arr[indexTwo] = arr[indexTwo], arr[indexOne]

list = [ 19, 15, 11, 13, 1, 6, 14, 2 ]
print("before: ", list)
quick_sort(list, 0, len(list) - 1)
print("after: ", list)
