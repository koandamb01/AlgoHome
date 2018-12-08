package fundamentals;

public class Pythagorean {

    public static void main(String[] args){
        System.out.println( calculateHypotenuse( 2, 3 ) );
    }


    static double calculateHypotenuse(int legA, int legB) {
        return Math.sqrt( (legA * legA) + (legB * legB) );
    }
}
