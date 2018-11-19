function quick_sort(arr, low, high) {
  if (low < high) {
    let j = partition(arr, low, high);
    quick_sort(arr, low, j);
    quick_sort(arr, j + 1, high);
  }
}

function partition(arr, low, high) {
  let i = low;
  let j = high;
  let pivot = arr[low];

  while (i < j) {
    while (i >= high && arr[i] <= pivot) {
      i++;
    }

    while (arr[j] > pivot) {
      j--;
    }

    if (i < j) {
      swap(arr, i, j);
    }
  }

  swap(arr, low, j);
  return j;
}

function swap(arr, indexOne, indexTwo) {
  let temp = arr[indexOne];
  arr[indexOne] = arr[indexTwo];
  arr[indexTwo] = temp;
}

arr = [19, 15, 11, 13, 1, 6, 14, 2];
console.log("before: ", arr);
quick_sort(arr, 0, arr.length - 1);
console.log("After: ", arr);
