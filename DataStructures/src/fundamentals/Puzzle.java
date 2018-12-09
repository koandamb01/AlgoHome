package fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzle {
    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array.
    // Also have the function return an array that only includes numbers that are greater than 10
    // (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    public ArrayList<Integer> printSumOfArrayValues(int[] arr){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int val : arr){
            sum += val;
            if(val > 10){
                newArr.add(val);
            }
        }
        System.out.println("Sum of all elements: " + sum);
        return newArr;
    }


    //  Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa.
    // Shuffle the array and print the name of each person.
    // Have the method also return an array with names that are longer than 5 characters.
    public ArrayList<String> printNamesFromArray(String[] names){
        ArrayList<String> longNanes = new ArrayList<String>();
        for(String name : names){
            System.out.println( "name: " + name );
            if(name.length() > 5){
                longNanes.add( name );
            }
        }
        return longNanes;
    }


    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values).
    // Shuffle the array and, after shuffling, display the last letter from the array.
    // Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
    public void isArrayFirstAvowel(){

        ArrayList<Character>letters = new ArrayList<Character>();
        String vowels = "aeiou";

        for(char ch = 'a'; ch <= 'z'; ch++){
            letters.add( ch );
        }
        Collections.shuffle( letters );
        System.out.println("last element in the list: " + letters.get(25));

        System.out.println("First element in the list: " + letters.get(0));

        if (vowels.indexOf( letters.get(0)) != -1){
            System.out.println("First element is a vowels: " + letters.get(0));
        }
        System.out.println( "Alphabets: " + letters.toString() );
    }


    // Generate and return an array with 10 random numbers between 55-100
    public ArrayList<Integer> generateTenNumbers(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        for(int i = 1; i <= 10; i++){
            numbers.add(random.nextInt( 49 ) + 51);
        }

        System.out.println( "rand: " + numbers.toString() );
        return numbers;
    }


    //  Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning).
    // Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value
   public ArrayList<Integer> generateTenNumbersAndFindMinMax(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        for(int i = 1; i <= 10; i++){
            numbers.add(random.nextInt(49) + 51);
        }

        Collections.sort(numbers);
        System.out.println("Min: " + Collections.min(numbers));
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println( "rand: " + numbers.toString() );
        return numbers;
   }


   //  Create a random string that is 5 characters long
    public void generateRandomString(){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        final String letters = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 1; i <= 5; i++){

           sb.append(letters.charAt(random.nextInt( 25 )));
        }

        System.out.println("Random String: " + sb.toString());
    }


    // Generate an array with 10 random strings that are each 5 characters long
    public void generateTenRandomString(){
        ArrayList<String> myStrings = new ArrayList<String>();
        Random random = new Random();

        final String letters = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 1; i <= 10; i++){
            StringBuilder sb = new StringBuilder();

            for(int j = 1; j <= 5; j++){
                sb.append(letters.charAt(random.nextInt( 25 )));
            }
            myStrings.add( sb.toString() );
        }

        System.out.println(myStrings.toString());
    }

}
