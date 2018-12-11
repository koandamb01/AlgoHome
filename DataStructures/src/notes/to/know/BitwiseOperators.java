package notes.to.know;

public class BitwiseOperators {
    public static void main(String[] args){
        int a = 15; // 0000 1111
        int b = 27; // 0001 1011

        // Binary AND Operator (&)
        int and  = a&b;

        // Binary OR Operator (|)
        int or = a|b;

        // Binary XOR Operator (^)
        int xor = a^a;

        // Binary One Complement Operator (~)
        int oneComplement = ~a;


        System.out.println( "And Operator: " + and);
        System.out.println( "OR Operator: " + or);
        System.out.println( "And Operator: " + xor);
        System.out.println( "And Operator: " + oneComplement);


    }
}
