package algosquestions;

public class SeparateStringandNumber {

    public static void main(String[] args){
        String inputString = "Interview01 Mohamed0411 Program1990";
        String alphabets = "";
        String num = "";

        char ch;

        for(int i = 0; i < inputString.length(); i++){
            ch = inputString.charAt(i);
            if(Character.isDigit(ch)){
                num += ch;
            }else{
                alphabets += ch;
            }
        }

        System.out.println("String: " + alphabets);
        System.out.println("Number: " + num);
    }
}
