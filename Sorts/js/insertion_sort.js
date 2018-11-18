function insertion_sort(arr) {
  for (let i = 0; i < arr.length; i++) {
    let j = i;
    while (j > 0 && arr[j - 1] > arr[j]) {
      swap(arr, j - 1, j);
      j--;
    }
  }
  return arr;
}

function swap(arr, indexOne, indexTwo) {
  let temp = arr[indexOne];
  arr[indexOne] = arr[indexTwo];
  arr[indexTwo] = temp;
}

console.log(insertion_sort([19, 15, 11, 13, 1, 6, 14, 2]));
