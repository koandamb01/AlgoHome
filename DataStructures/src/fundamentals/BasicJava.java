package fundamentals;

import java.util.ArrayList;

public class BasicJava {

    // Write a method that prints all the numbers from 1 to 255.
    public void print1T0255(){
        StringBuilder out = new StringBuilder();
        for (int i = 1; i <= 255; i++){
            out.append( i + " ");
        }
        System.out.println( out.toString());
    }


    // Write a method that prints all the odd numbers from 1 to 255.
    public void printOdd1To255(){
        StringBuilder out = new StringBuilder();
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                out.append( i + " ");
            }
        }
        System.out.println( out );
    }

    // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
    public void printNumbersAndSum(){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum += i;
            System.out.println( "New number: " + i + " Sum: " + sum);
        }

    }

    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen.
    // Being able to loop through each member of the array is extremely important.
    public void printArrayValues(int[] arr){
        for(int val : arr){
            System.out.println( val );
        }
    }


    // Find Max
    //Write a method (sets of instructions) that takes any array and prints the maximum value in the array.
    // Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]),
    // or even a mix of positive numbers, negative numbers and zero.
    public void findMax(int[] arr){
        int max = arr[0];
        for(int val : arr){
            if(max < val){
                max = val;
            }
        }
        System.out.println( "Maximum values: " + max );
    }

    // Get Average
    //Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5.
    // Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void findAverage(int[] arr){
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        System.out.println( "Average: " + sum / arr.length);
    }


    // Array with Odd Numbers
    //Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255.
    // When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public void ArrayWithOdd(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int val : arr){
            if(val % 2 != 0){
                newArr.add( val );
            }
        }
        System.out.println( newArr.toString() );
    }

    // Greater Than Y
    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y.
    // For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2
    // (since there are two values in the array that are greater than 3)
    public void greaterThanY(int[] arr, int y){
        int count = 0;
        for(int val : arr){
            if(val > y){
                count++;
            }
        }
        System.out.println( "Number of values Greater than Y: " + count );
    }

    // Square the values
    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself.
    // When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public int[] squareArrayValues(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
       return arr;
    }


    // Eliminate Negative Numbers
    //Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0.
    // When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public int[] eleminateNegativeNumbers(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }

    // Max, Min, and Average
    // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array,
    // the minimum value in the array, and the average of the values in the array.
    // The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public int[] findMaxMinAvg(int[] arr){
        int max = 0, min = 0, sum = 0;
        for(int val : arr){
            if(val > max){
                max = val;
            } else if(val < min) {
                min = val;
            }
            sum += val;
        }

        int avg = sum / arr.length;
        return new int[]{max, min, avg};
    }


    // Shifting the Values in the Array
    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front.
    // For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0].
    // Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    public int[] shitArrayValuesToFront(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                arr[i] = 0;
            }else{
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
}
