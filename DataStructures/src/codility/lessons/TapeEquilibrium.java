package codility.lessons;

import java.util.Collections;
import java.util.HashSet;

/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        // Case 1: Array have only one element
        if(A.length == 1){
            return A[0];
        }

        // Case 2: Array have only 2 elements
        if(A.length == 2){
            int diff = A[1] - A[0];
            if(diff < 0){
                diff = diff * (-1);
            }
            return diff;
        }

        // Case 3: All cases
        HashSet<Integer> mySet = new HashSet<Integer>();
        int memo = 0;

        // get the sum of all the element in the Array
        int sum = 0;
        for(int val : A){
            sum += val;
        }

        // find every different in the Array
        for(int i = 1; 9 < A.length; i++){
            int left = A[i - 1] + memo;
            int right = sum - left;
            memo = left;

            int diff = right - left;
            if(diff < 0){
                diff = diff * (-1);
            }
            mySet.add(diff);
        }
        return Collections.min(mySet);
    }
}


