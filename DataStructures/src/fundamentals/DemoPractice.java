package fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DemoPractice {
    public static void main(String[] args){
        int[] A = {1, 3, 6, 4, 1, 2,5};
        int[] B = {1,2,3};

        System.out.println( solution( A ) );
    }

    static int solution(int[] A) {
        // write your code in Java SE 8
        int min = 1;
        HashSet<Integer> mySet = new HashSet<Integer>();
        while (mySet.contains(min)){
            min++;
        }
        return min;
    }


    static boolean isPerfectSquare(int num){
        if(num == 0 || num == 1){
            return true;
        }
        for(int i = 1; i < num/2; i++){
            int temp = i*i;

            if(temp == num){
                return true;
            }else if(temp > num){
                return false;
            }
            else{
                continue;
            }
        }
        return false;
    }
}
