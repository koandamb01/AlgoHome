package codility;

public class BinaryGap {

    public static void main(String[] args){
        System.out.println(solution( 32 ));
    }

    static int solution(int N) {
        // write your code in Java SE 8
        String binary = numberToBinary(N);
        int gapLen = 0;
        int i = 0;
        System.out.println( "len: " + binary.length());

        while(i < binary.length()){
            char ch = binary.charAt(i);

            if(ch == '1' && i < binary.length() - 2){
                i++;
                ch = binary.charAt(i);
                int count = 0;
                while(ch == '0' && i < binary.length() - 1){
                    count++;
                    i++;
                    ch = binary.charAt(i);
                }

                if(ch == '1' && count > gapLen){
                    gapLen = count;
                }
            }else{
                i++;
            }
        }
        return gapLen;
    }


    static String numberToBinary(int num){
        String binary = "";
        while(num > 0){
            int a = num % 2;
            binary = a + binary;
            num = num / 2;
        }

        System.out.println( "Binary: " + binary );
        return binary;
    }
}
