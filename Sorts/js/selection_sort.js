function selection_sort(arr) {
  for (let i = 0; i < arr.length; i++) {
    let minIndex = i; // init min
    for (let j = i; j < arr.length; j++) {
      if (arr[j] < arr[minIndex]) {
        minIndex = j;
        isMinUpdated = true;
      }
    }
    if (minIndex !== i) {
      swap(arr, i, minIndex);
    }
  }

  return arr;
}

function swap(arr, indexOne, indexTwo) {
  let temp = arr[indexOne];
  arr[indexOne] = arr[indexTwo];
  arr[indexTwo] = temp;
}

console.log(selection_sort([4, 6, 1, 15, 13, 11, 9, 7]));
