# write a function that take an integer number as an input and return true if the number is prime
# and return false if the number is not prime
def isPrime(num):
    i = 2
    while i*i <= num: # i < sqaureRoot(num)
        if num % i == 0:
            print(f"{num} is divisible by {i} so it's not a prime number")
            return False
        i += 1
    return True

# Write a function that take an integer as an input and return it factorial
def factorial(num):
    if num < 0:
        return -1
    elif num == 0:
        return 1
    else:
        return num * factorial(num - 1)


# write a function that print all the fibonacci number from index 0 to n
def printAllFib(n):
    for i in range(n):
        print(f"fibonacci at index {i} is {fib(i)}")

def fib(n):
    if n == 0 or n == 1:
        return n
    return fib(n - 1) + fib(n - 2)
printAllFib(7)