// write a function that take an integer number as an input and return true if the number is prime
// and return false if the number is not prime

function isPrime(num) {
  for (let i = 2; i * i <= num; i++) {
    if (num % i === 0) {
      // i < sqaureRoot(num)
      return false;
    }
  }
  return true;
}

// Write a function that take an integer as an input and return it factorial
function factorial(num) {
  if (num < 0) {
    return -1;
  } else if (num === 0) {
    return 1;
  } else {
    return num * factorial(num - 1);
  }
}

// write a function that print all the fibonacci number from index 0 to n
function allFib(n) {
  for (let i = 0; i < n; i++) {
    console.log(`fib at index ${i} is ${fib(i)}`);
  }
}

function fib(n) {
  if (n == 0 || n == 1) {
    return n;
  }
  return fib(n - 1) + fib(n - 2);
}

allFib(5);
