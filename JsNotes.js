// to clone an object;
// const obj = {
//   a: {
//     b: {
//       c: 1
//     }
//   }
// };

// // to clone obj
// const clone = Object.assign({}, obj);

const a = [1, 2, 5, 7, 9];
const b = [2, 5, 7, 12, 100];
const c = [];

let i = 0;
let j = 0;
let k = 0;

while (i < a.length && j < b.length) {
  if (a[i] < b[j]) {
    c[k] = a[i];
  }
}
