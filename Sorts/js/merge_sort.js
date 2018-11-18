function merge_sort(arr) {
  if (arr.length > 1) {
    let mid = Math.floor(arr.length / 2);
    // split the array into half
    let leftHalf = arr.slice(0, mid);
    let rightHalf = arr.slice(mid);

    // call merge sort again
    merge_sort(leftHalf);
    merge_sort(rightHalf);

    // merge these two sorted arrays
    merge(arr, leftHalf, rightHalf);
  }
}

function merge(arr, leftHalf, rightHalf) {
  let i = (j = k = 0); // same as i = 0; j = 0; k = 0;
  while (i < leftHalf.length && j < rightHalf.length) {
    if (leftHalf[i] < rightHalf[j]) {
      arr[k] = leftHalf[i];
      i++;
    } else {
      arr[k] = rightHalf[j];
      j++;
    }
    k++;
  }

  // check if leftHalf still has values
  while (i < leftHalf.length) {
    arr[k] = leftHalf[i];
    i++;
    k++;
  }
  // check if right haft still has values
  while (j < rightHalf.length) {
    arr[k] = rightHalf[j];
    j++;
    k++;
  }
}

arr = [5, 15, 2, 20, 11, 16, 4, 14, 6, 3, 8];
console.log("before: ", arr);
merge_sort(arr);
console.log("after: ", arr);
