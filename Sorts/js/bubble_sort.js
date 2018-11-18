function bubble_sort(arr) {
  for (let i = arr.length - 1; i >= 0; i--) {
    let isWapped = false;
    for (let j = 0; j < i; j++) {
      if (arr[j] > arr[j + 1]) {
        swap(arr, j, j + 1);
        isWapped = true;
      }
    }
    if (isWapped === false) {
      return arr;
    }
  }
  return arr;
}

function swap(arr, indexOne, indexTwo) {
  let temp = arr[indexOne];
  arr[indexOne] = arr[indexTwo];
  arr[indexTwo] = temp;
}
console.log(bubble_sort([4, 6, 1, 15, 13, 11, 9, 7]));
