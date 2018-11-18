def selection_sort(list):
    for i in range(len(list)):
        minIndex = i
        j = i + 1
        
        while j <= len(list) - 1:
            if list[j] < list[minIndex]:
                minIndex = j
            j += 1
        
        temp = list[minIndex]
        list[minIndex] = list[i]
        list[i] = temp
    return list

list = [3, 5, 6, 7, 8, 12, 1, 3, 4]

print(selection_sort(list))